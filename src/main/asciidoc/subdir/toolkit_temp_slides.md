= CODAPPS: Conditional statements, loops and data structures
Clément Levallois <levallois@em-lyon.com>
last modified: {docdate}
:icons: font
:iconsfont: font-awesome
:source-highlighter: rouge
:revnumber: 1.0
:docinfo: shared
:example-caption!:


:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

[.stretch]
image::EMLyon_logo_corp.png[width="242" align="center"]


==  'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes

==  1. Useful additions to your coding toolkit

==  !
What we have seen so far is really the essential of coding: variables, methods and classes.

We can code an app with this.
But what makes programming really interesting is when we take advantage of three things computers (and mobile phones) are really good at:

==  !
1. they can adapt their behavior to changing environments
2. they are really fast
3. they can handle huge volumes of things

In this lesson, we learn how to do these 3 things. Promised, this is the last of the "technical" lessons.
After this one you will create a great app.

==  !
==== a. If ...  else ... making your app adapt

==  !
If your app does always the same thing, it will be quickly boring.

What you need is the ability to code something that says:

"if the user of the app chooses this option, then do this. If not, do that instead"

==  !
This need is so universal that all programming languages have a way to express this "if this, then that".

The formal name for it is a `conditional statement`.

Let's see:

==  !
[[if-example]]
.Creating a conditional statement
[source,java]
----
Float priceItemInEuros;
priceItemInEuros = 5.99f; // <1>
Label productLabel = new Label();
if (priceItemInEuros < 6) {
  productLabel.setText("cheap product!");
}
----

This will put the text "cheap product" in the Label, *only if the price of the product is under 6*.

==  !
Let's have a closer look at the syntax (the boring part, but where any mistake will make your build fail)

==  !
[.stretch]
image::Detailing-how-a-conditional-statement-works.png[align="center", title="Detailing how a conditional statement works"]


==  !
That's about it for conditional statements. We just need to learn to write "if these things are *equal*" or "if these things are *unequal*":

==  !
[[if-equal-example]]
.Creating a conditional statement
[source,java]
----
Float priceItemInEuros;
priceItemInEuros = 5.99f; // <1>
Label productLabel = new Label();
if (priceItemInEuros == 5.99) { //<1>
  productLabel.setText("the price is exactly 5.99");
}
if (priceItemInEuros != 5.99) { //<2>
  productLabel.setText("the price is different from 5.99");
}

----
<1> the `==` is surprising. Why twice `=`? Just because `=` is already taken to assign a value to a variable.
<2> `!=` looks weird, why not just `≠`? Well try to find ≠ on your keyboard 😉

==  !
Before we leave conditional statements: we'll see in the app that we use them *a lot*. Some even say that the many products with "artificial intelligence" sold out there actually just have plenty of conditional statements in their code 😉

==  !
// embedded tweet
++++
<br/>
<div style="width: 400px !important;margin-right: auto !important;margin-left: auto !important;">
<blockquote class="twitter-tweet" data-lang="en"><p lang="en" dir="ltr">You say: &quot;We added AI to our product&quot;<br>I hear: &quot;We added a bunch more IF statements to our codebase&quot;</p>&mdash; I Am Devloper (@iamdevloper) <a href="https://twitter.com/iamdevloper/status/830070592611172357?ref_src=twsrc%5Etfw">February 10, 2017</a></blockquote>
<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
</div>
<br/>
++++

==  !


==  The end

==  !
Questions? Want to open a discussion on this lesson? Visit the forum https://github.com/seinecle/codapps/issues[here] (need a free Github account).

==  !
Find references for this lesson, and other lessons, https://seinecle.github.io/codapps/[here].

==  !
Licence: Creative Commons, https://creativecommons.org/licenses/by/4.0/legalcode[Attribution 4.0 International] (CC BY 4.0).
You are free to:

- copy and redistribute the material in any medium or format
- Adapt — remix, transform, and build upon the material

=> for any purpose, even commercially.

==  !
image:round_portrait_mini_150.png[align="center", role="right"]
This course is designed by Clement Levallois.

Discover my other courses in data / tech for business: http://www.clementlevallois.net

Or get in touch via Twitter: https://www.twitter.com/seinecle[@seinecle]
pass:[    <!-- Start of StatCounter Code for Default Guide -->
    <script type="text/javascript">
        var sc_project = 11592657;
        var sc_invisible = 1;
        var sc_security = "11592657";
        var scJsHost = (("https:" == document.location.protocol) ?
            "https://secure." : "http://www.");
        document.write("<sc" + "ript type='text/javascript' src='" +
            scJsHost +
            "statcounter.com/counter/counter.js'></" + "script>");
    </script>
    <noscript><div class="statcounter"><a title="site stats"
    href="http://statcounter.com/" target="_blank"><img
    class="statcounter"
    src="//c.statcounter.com/11592657/0/11592657/1/" alt="site
    stats"></a></div></noscript>
    <!-- End of StatCounter Code for Default Guide -->]
