= CODAPPS: Conditional statements, loops and data structures
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

== 1. Useful additions to your coding toolkit
//ST: 1. Useful additions to your coding toolkit

//ST: !
What we have seen so far is really the essential of coding: variables, methods and classes.

We can code an app with this.
But what makes programming feel like magic is when we take advantage of three things computers (and mobile phones) are really good at:

//ST: !
1. they can adapt their behavior to changing environments
2. they are really fast
3. they can handle huge volumes of things

//ST: !
In this lesson, we learn how to do these 3 things. Promised, this is the last of the "technical" lessons.
After this one you will create a great app.

== 2. Making your app adapt
//ST: 2. Making your app adapt

//ST: !
If your app does always the same thing, it will be quickly boring.
What you need is the ability to code something that says:

"if the user of the app chooses this option, then do this. If not, do that instead"

//ST: !
This need is so universal that all programming languages have a way to express this "if this is true, then do that".

The formal name for it is a `conditional statement`.

//ST: !
==== a. How to write a conditional statement

//ST: !
[[if-example]]
.Creating a conditional statement
[source,java]
----
Float priceItemInEuros;
priceItemInEuros = 5.99f;
Label productLabel = new Label();
if (priceItemInEuros < 6) {
  productLabel.setText("cheap product!");
}
----

This will put the text "cheap product" in the Label, *only if the price of the product is under 6*.

//ST: !
Let's have a closer look at the syntax (the boring part, but where any mistake will make your build fail)

//ST: !
image::Detailing-how-a-conditional-statement-works.png[align="center", title="Detailing how a conditional statement works"]
{nbsp} +

//ST: !
That's about it for conditional statements.

We have seen a condition that said "if this thing is *lower than* this other thing".

We just need to learn to write "if these things are *equal*" or "if these things are *unequal*", because these are frequent use cases:

//ST: !
==== b. How to write an "equal" and "unequal" condition

//ST: !
[[if-equal-example]]
.Equal and unequal statements
[source,java]
----
Float priceItemInEuros;
priceItemInEuros = 5.99f;
Label productLabel = new Label();
if (priceItemInEuros == 5.99) { //<1>
  productLabel.setText("the price is exactly 5.99");
}
if (priceItemInEuros != 5.99) { //<2>
  productLabel.setText("the price is different from 5.99");
}
----
<1> the `==` is surprising. Why twice `=`? Just because `=` is already taken to mean that we assign a value to a variable.
<2> `!=` looks weird, why not just `≠`? Well try to find ≠ on your keyboard 😉

//ST: !
There are other important subtleties about conditionals, but we leave them for the "cheatsheet" lesson in this module.

A last remark: we'll see in the app that we use conditional statements *a lot* because they make the app so powerful and flexible.

Some even joke that many products with "artificial intelligence" sold out there actually just have plenty of conditional statements in their code to mimic an "intelligent behavior" 😉

//ST: !
(for example, you could build a chat bot with conditional statements: "if the person asks x, answer this". "if they asks y, answer that". Etc...)

//ST: !
// embedded tweet
++++
<br/>
<div style="width: 400px !important;margin-right: auto !important;margin-left: auto !important;">
<blockquote class="twitter-tweet" data-lang="en"><p lang="en" dir="ltr">You say: &quot;We added AI to our product&quot;<br>I hear: &quot;We added a bunch more IF statements to our codebase&quot;</p>&mdash; I Am Devloper (@iamdevloper) <a href="https://twitter.com/iamdevloper/status/830070592611172357?ref_src=twsrc%5Etfw">February 10, 2017</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
</div>
<br/>
++++

== 3. Making your app go fast
//ST: 3. Making your app go fast

//ST: !
Computers can do things quickly, we know that. If you write these three lines of code:

//ST: !
[[three-statements]]
.Three lines of code
[source,java]
----
Float priceItemInEuros = 5.99f;
Label priceLabel = new Label();
priceLabel.setText(priceItemInEuros);
----

//ST: !
Your mobile phone will run these lines of code in less than a millisecond.

But to make your app do thousands of things per second, do we need to write thousand lines of code to describe each of these things?

Certainly not.

//ST: !
Actually, many things happen in loops. The computer does one thing, and as it is in a loop, it gets repeated for as long as you need.

//ST: !
Is the loop repeating 1000 times the same thing?
No! If you put a conditional statement in the loop (see above for conditional statements!), then each turn of the loop can do something different. Clever!

Ok, how to write loops?

//ST: !
==== a. How to write loops

//ST: !
There are many ways to write loops, but here is a common way:

//ST: !
[[loop]]
.Writing a loop
[source,java]
----
for ( int i = 0; i<100; i = i+1){
  System.out.println("I looped " + i);
}

----

//ST: !
Before we have a closer look at what these lines of code mean, let's see what they do in practice:

====
icon:child[3x] Your turn!

__Copy paste the 3 lines of code above in the console just below, *line by line*, and see what happens__
====

//ST: !
++++
<iframe src="https://repl.exploreyourdata.com/ui/console.html" style="width: 500px; height: 150px; border: 0px"></iframe>
++++

//ST: !
[#loop-open-solution]
Here is the solution:

//ST: !
[#loop-solution]
image::loop-example.jpg[align="center", title="Looping - a simple example"]
{nbsp} +

//ST: !
Just like for the conditional statements, the way to write a loop looks a bit barbarian, with plenty of `( )` and `;` and `{ }`

Don't worry, it is not about memorizing everthing by heart, but simply to at least get the general picture.

Then you can have the cheat sheet (available in this module) printed next to you when you code, as a helper.

//ST: !
==== b. a closer look at the syntax

//ST: !
So let's have a closer look at what we did:

//ST: !
image::A-detailed-explanation-of-loops.png[align="center",title="A detailed explanation of loops"]
{nbsp} +

//ST: !
You don't need to memorize perfectly how to write for loops, just pay attention to...

//ST: !
- the semi-colon `;` -> did you notice there were two of these in the first line? They are essential.
- the opening and closing brackets, followed at the end of the line by a `{`
- the closing `}` which marks the end of what's enclose in the loop.

//ST: !
Your app can now go fast!

That's about it for the loops.
We'll meet them again just below, in a simpler version.


== 4. Making your app handle lots of stuff
//ST: 4. Making your app handle lots of stuff

//ST: !
Programmers who created the animations for the Pixar movie "Up" had to code a lot of balloons (https://en.wikipedia.org/wiki/Up_%282009_film%29[10,000 to 20,000]):

//ST: !
image::up.jpg[align="center",title="Lots of balloons"]
{nbsp} +

//ST: !
How did they handle these balloons in their code? Did they create 20,000 variables and if so, did they just patiently do:

//ST: !
[[balloons]]
.20,000 balloon variables
[source,java]
----
Balloon balloon1 = new Balloon();
Balloon balloon2 = new Balloon();
Balloon balloon3 = new Balloon();
etc...
----
and so on for 20,000 lines? No.

//ST: !
What they probably did is that they used a loop to create the balloons:

//ST: !
[[balloons]]
.20,000 balloon variables
[source,java]
----
for (int i = 0; i<20000;i = i+1) {
  Balloon balloon = new Balloon();
}
----

//ST: !
Ok, but where get each of these balloons stored, so that they can be used later (to add color to them, animate them...)?

We need something to handle our 20,000 balloons.
Like a bag or a box where we could put them, or remove them, or retrieve them.

//ST: !
*Collections* are these "bags" we need to handle a lot of variables together.
There are many collections available, but we'll see just one here: the `ArrayList`.

Let's see how it works:

//ST: !
[[ArrayLists]]
.An ArrayList to handle all your balloons at once
[source,java]
----
ArrayList<Balloon> balloons = new ArrayList(); // <1>

for (int i = 0; i<20000;i = i+1){
  Balloon myBalloon = new Balloon();
  balloons.add(myBalloon); // <2>
}
----
<1> ArrayList is an object.
- You need to define it and instantiate it.
- Don't forget the capital A and capital L! **A**rray**L**ist
- what about the `<Balloon>` part? Because `ArrayList` can contain just *one type of Object*, which you need to mention between the `<>`.

//ST: !
<2> The ArrayList `balloons` has a method called `add` to add balloons to it.

Now our 20,000 balloons are all in one ArrayList. How is it useful?

//ST: !
Let's imagine we want to show all of them on the screen:

//ST: !
[[using-lists]]
.Showing all balloons on screen
[source,java]
----
Form1 myScreen = new Form1 ();
for (Balloon balloon: balloons) { // <1>
  myScreen.add(balloon); // <2>
}
----
<1> a new way to loop, different from the one we've seen above. It means: "for each balloon in the list, do ..."
<2> in this example I assume that Balloon is a Component which can be added to a Form, like a `Label` or a `Button`

//ST: !
Another possibility: showing on screen only the largest balloons:

//ST: !
[[using-lists-with-if]]
.Showing only the largest balloons
[source,java]
----
Form1 myScreen = new Form1 ();

for (Balloon balloon: balloons){ // <1>
  if (balloon.getDiameter() > 3){
    myScreen.add(balloon);
  }

} // <1>
----
<1> don't forget this closing curly brace, which corresponds to the opening curly brace above!

//ST: !
That was a lot to digest, but now you have a lot of tools and techniques to code whatever you want. Let's meet at the next lesson to build an app!

In the meantime, you can go and print the "cheat sheet" for this Module 5: a handy page where you'll find a summary of all these techniques we've just seen.

== The end
//ST: The end

//ST: !
Questions? Want to open a discussion on this lesson? Visit the forum https://github.com/seinecle/codapps/issues[here] (need a free Github account).

//ST: !
Find references for this lesson, and other lessons, https://seinecle.github.io/codapps/[here].

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
