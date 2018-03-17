= CODAPPS: Animating the score and the count of cookies produced per second
Clément Levallois <levallois@em-lyon.com>
last modified: {docdate}
:icons: font
:iconsfont: font-awesome
:source-highlighter: rouge
:revnumber: 1.0
:docinfo: shared
:example-caption!:
:sourcedir: ../../../../main/java


:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

image::EMLyon_logo_corp.png[width="242" align="center"]
{nbsp} +

//ST: 'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes

== 1. The starting point
//ST: 1.The starting point

//ST: !
The files of the app so far:

- link:../resources/form-with-layout-and-components-and-actionevents.txt[the code of Form1.java]
- link:../resources/class-parameters.txt[the code of Parameters.java]

//ST: !
What we have done so far is simple: a player touching the cookie to add one to the score, or touching buttons to buy tools (auto click, grandma, farm).

But we want an app which is more dynamic: the screen should change "by itself" when time is passing.

//ST: !
For example, when the player buys a grandma, the grandma produces one new cookie per second, automatically.

*The score should update every second to show new cookie added, without the player clicking anywhere of course.*

== 2. Introducing the method `animate()`
//ST: 2. Introducing the method `animate()`

//ST: !
How should this automatic update happen? *Forms have a special method* we can use for this, called `animate()`;

//ST: !
This function is triggered every millisecond.
This means that anything we write in this method will happen, every millisecond.

//ST: !
So if we write in it "compute the score and refresh the score on screen", it will happen even if the player did not click on anything.

That's what we need! Let's do this:

//ST: !
[[animate-method]]
.Adding the "animate()" method
[source,java]
----
@Override //<1>
public boolean animate() {
    // write anything you want here
    return true;  //<2>
}
----
<1> This strange `@Override` annotation means that our custom `animate()` method will replace the original `animate()` method of basic forms.
<2> the method will execute every millisecond *if it returns `true` value*. If it returns false, nothing is updated.

//ST: !
*Where should this method be written?*

Still in our class `Form1`, write before the curly brace `}` closing the class:

//ST: !
image::animate-method-1.png[align="center", title="The animate method should be written in the class Form1"]
{nbsp} +

[WARNING]
====
Please note the last curly brace in line 138! This is the one closing the class, after the method.
====

//ST: !
For this method to be executed every millisecond, we need one last thing.

-> we must add a line of code at the beginning of the constructor (the method `Form1` where we have written most of our code so far):

//ST: !
[[registrating-animation]]
.A line of code to "activate" the `animate()` method
[source,java]
----
public Form1() { //<1>
    registerAnimated(this);  //<2>
}
----
<1> Don't write this again, this is is just to show you where the code is
<2> *The line of code you should add.*

== 3. What should be animated? The computation of the score and its display
//ST: 3. What should be animated? The computation of the score and its display

//ST: !
The app should update the score: compute the new score and show it on screen.

How to compute the score?

//ST: !
- grandmas bake a number of cookies per second
- farms harvest a number of cookies per second
- auto clicks produce a new cookie every 10 seconds (let's leave this one for the moment)

-> *So we should measure when one second has passed and add the numbers of cookies produced.*

Let's create a method dedicated to this computation:

//ST: !
[[compute-score]]
.A method to compute the score every second
[source,java]
----
long lastTimeScoreWasComputed; // <1>

private void computeScore() { // <2>
    long currentTimeInSeconds = System.currentTimeMillis() / 1000; // <3>
    long lastTimeScoreWasComputedInSeconds = lastTimeScoreWasComputed / 1000;  // <4>

    if (currentTimeInSeconds != lastTimeScoreWasComputedInSeconds) {  // <5>
        score = score + myParameters.grandmaOwned * myParameters.grandmaProd + myParameters.farmOwned * myParameters.farmProd;  // <6>
        scoreLabel.setText(score + " cookies");  // <7>
        lastTimeScoreWasComputed = System.currentTimeMillis();  // <8>
    }
}
----
<1> we will need a variable that will keep track of the last time the score was computed. *Write this variable at the top of the class*
<2> the beginning of the method
<3> there is a static method which provides the time as it is now in milliseconds. We divide it by 1000 to have the time in seconds, and store it in `currentTimeInSeconds`
<4> we take the last time we computed the score (in milliseconds) and divide it by 1000 to have it in seconds
<5> if the current time is different from the last time we computed the score, it means a second has passed...
<6> ... and so we can add to the score: how many grandmas we have x how many cookies each grandma produces + how many farms we have x how many cookies each farm produces
<7> ... and we can update the `Label` showing the score. We had declared this Label  `scoreLabel` in the constructor method `Form1`. *We must displace the declaration of this variable to the top of the file so that it can be referenced from this method*.
<8> ... and before we leave the method, we update the value for `lastTimeScoreWasComputed`, so that a new full second will need to elapse before the score is computed again.

//ST: !
How can this method be executed? Simply by calling it from the `animate()` method:

//ST: !
[[animate-method-with-compute-score]]
.Making the method computeScore part of the animation
[source,java]
----
@Override
public boolean animate() {
    computeScore();  //<1>
    return true;
}
----
<1> the method `computeScore()` will be executed every millisecond!


== 4. What should be animated? The computation of number of cookies produced per second
//ST: 4. 4. What should be animated? The computation of number of cookies produced per second

//ST: !
Let's create a method dedicated to this computation.

That's very easy: we simply take the number of cookies produced per second by the grandmas and farms we own.

//ST: !
[[compute-cookies-per-second]]
.A method to compute the number of cookies produced per second
[source,java]
----
float cookiesPerSecond; // <1>

private void computeCookiesPerSecond() {
    cookiesPerSecond =  myParameters.grandmaOwned * myParameters.grandmaProd + myParameters.farmOwned * myParameters.farmProd;
    cookiesPerSecondLabel.setText(cookiesPerSecond + " cookies per second"); // <2>

}
----
<1> we will need a variable that will keep track of the cookies per second. *Write this variable at the top of the class*
<2> we had declared a variable called `cookiesPerSecondLabel` in the constructor method `Form1`. *We must displace the declaration of this variable to the top of the file so that it can be referenced from this method*.
//ST: !
How can this method be executed? Simply by calling it from the `animate()` method, just like we did with `computeScore()`:

//ST: !
[[animate-method-with-compute-score-and-cookies-per-second]]
.Making the method computeCookiesPerSecond part of the animation
[source,java]
----
@Override
public boolean animate() {
    computeScore();  //<1>
    computeCookiesPerSecond();  //<1>
    return true;
}
----
<1> the methods `computeScore()` and `computeCookiesPerSecond()` will be executed every millisecond!

== 4. Fine-tuning: slowing down the animation
//ST: 4. Fine-tuning: slowing down the animation

//ST: !
The method `animate()` runs in loop continuously as fast as it can, so it will be executing the calculus included in `computeScore()` non stop.

That is a bit unnecessary and the phones risk to heat or to slow down. We don't need to compute the score every millisecond, once every 100 milliseconds is largely enough.

So let's slow it down:

//ST: !
[[animate-method-with-compute-score-and-delay]]
.Adding a delay to animate only every 100 milliseconds
[source,java]
----
long lastAnimatedTime; // <1>

@Override
public boolean animate() {
    if (System.currentTimeMillis() / 100 > lastAnimatedTime / 100) { // <2>
        computeScore(); // <3>
        computeCookiesPerSecond(); // <4>
        lastAnimatedTime = System.currentTimeMillis();
        return true;
    } else {
        return false;  // <5>
    }
}
----
<1> we will need a variable that will keep track of the last time the animation was performed. *Write this variable at the top of the class*
<2> if 100 milliseconds have passed since we last animated...
<3> ... compute the score
<4> ... compute the cookies per second
<5> ... if not, return `false` (no animation takes place)

This is the final version of our code in the file `Form1`: - link:../resources/form1-final[you can check it here].

== 5. Congratulations!
//ST: 5. Congratulations!

//ST: !
That's it! You now have a fully functional cookie clicker mobile app!

//ST: !
- it remains to add how to get the auto click added (it adds a score point every 10 seconds, so that's a bit tricky)
- you could add many other tools, new features, sound, visual animations... it's up to you!
- and many details could be improved (removing the decimals of the score for instance)

//ST: !
All this work which remains to be done make you realize that the harder might not be the coding itself, but a management issue:

- how can I invest all the time and money necessary to develop the app?
- what kind of revenues could pay for this cost of development?
- how do I manage my team of developers?
- what are the critical features my users or customers want? (a better design of the app? A better game play? a tablet version of the app?)

//ST: !
This sort of questions are best answered by getting an education in business and management.

*But* the experience you gained in mobile development in this course, even very modest, will help you address these questions in a much better way - because you understand better what "mobile development" covers.

//ST: !
This is the end of this course. I hope you enjoyed it. As always, your questions and suggestions for improvement of the course are welcome.

https://github.com/emlyon/codapps/issues[Open an issue on Github and ask!]

//ST: !
Happy coding!

[underline]#Clement Levallois#

== The end
//ST: The end

//ST: !
Questions? Want to open a discussion on this lesson? Visit the forum https://github.com/emlyon/codapps/issues[here] (need a free Github account).

//ST: !
Find references for this lesson, and other lessons, https://emlyon.github.io/codapps/[here].

//ST: !
Licence: Creative Commons, https://creativecommons.org/licenses/by/4.0/legalcode[Attribution 4.0 International] (CC BY 4.0).
You are free to:

- copy and redistribute the material in any medium or format
- Adapt — remix, transform, and build upon the material

=> for any purpose, even commercially.

//ST: !
image:round_portrait_mini_150.png[align="center", role="right"]
This course is designed by Clement Levallois.

Discover my other courses in data / tech for business: http://www.clementlevallois.net

Or get in touch via Twitter: https://www.twitter.com/seinecle[@seinecle]
pass:[    <!-- Start of StatCounter Code for Default Guide -->
    <script type="text/javascript">
        var sc_project = 11592657;
        var sc_invisible = 1;
        var sc_security = "5154b75d";
        var scJsHost = (("https:" == document.location.protocol) ?
            "https://secure." : "http://www.");
        document.write("<sc" + "ript type='text/javascript' src='" +
            scJsHost +
            "statcounter.com/counter/counter.js'></" + "script>");
    </script>
    <noscript><div class="statcounter"><a title="site stats"
    href="http://statcounter.com/" target="_blank"><img
    class="statcounter"
    src="//c.statcounter.com/11592657/0/5154b75d/1/" alt="site
    stats"></a></div></noscript>
    <!-- End of StatCounter Code for Default Guide -->]
