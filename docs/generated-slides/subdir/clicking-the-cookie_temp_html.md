= CODAPPS: Making the cookie click
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

== 1. Recap of the app so far
//ST: 1. Recap of the app so far

Before we start, it is good to have an overview of where we stand so far:

//ST: !
1. We created a class called `Form1`, this is the screen of the app.
2. In it, we have created a special method called `Form1` (same name as the class). This method will execute when the screen is instantiated
3. In this method, we have created variables for our images.

//ST: !
[start=4]
4. We have also created containers and given them a layout. Our screen is organized in three regions.
5. We have created Labels, ScaleImageButton and MultiButtons and added them to the screen.
6. The interface is ready, it should look like:

//ST: !
image::How-your-app-should-look-like-so-far.png[align="center",title="How your app should look like so far"]
{nbsp} +

//ST: !
If you are lost or unsure about the code you have written so far, link:../resources/form-with-layout-and-components.txt[here is a file with the complete code]. You should of course place it in a file named `Form1` (to create this file, https://emlyon.github.io/codapps/generated-html/layout-design.html#_2_creating_the_main_screen_of_the_app[follow these instructions]).

//ST: !
Now we need that the app "do something" when the player clicks on different parts of the screen. This is what we are going to write now.

== 2. Increasing the score when the cookie is clicked
//ST: 2. Increasing the score when the cookie is clicked

//ST: !
First, we need a variable to store the value of the score. We will put this variable near the top of our file:

//ST: !
[[score-variable]]
.Adding a variable to keep track of the score
[source,java]
----
package net.clementlevallois.net.cookieclicker.ultimate;

public class Form1 extends com.codename1.ui.Form {

  Resources theme = Resources.getGlobalResources();
  float score = 0f; // <1>

}
----
<1> we create a new variable. The `f` after the zero is to indicate the number is a decimal, https://emlyon.github.io/codapps/generated-html/variables-and-objects.html#_c_strong_float_strong_strong_double_strong_and_strong_long_strong_variables_to_store_decimal_numbers_and_big_numbers[see this lesson].


//ST: !
Then we add lines of code *in the constructor method `public Form1 () {` where we have written everything so far*:


//ST: !
[[coockie-listener]]
.Adding an action listener to the cookie ScaleImageButton
[source,java]
----
centerRegion.add(autoclickButton); //<1>
centerRegion.add(grandmaButton); //<1>
centerRegion.add(farmButton); //<1>

cookieCentral.addActionListener(  //<2>
                (event) -> { }  //<3>
        ); //<4>
----
<1> The last lines we have written in the previous lesson, for reference.
<2> we use the method `addActionListener` for the variable `cookieCentral` (which is the picture of our cookie).
<3> Anything written between the curly braces `{ }` will be executed when the user touches the cookie on sreen!
<4> this parenthesis closes the `addActionListener` method, and the `;` ends the line.

//ST: !
The lines of code above are typically *hard to understand the first time*, because there are brackets, curly braces and semicolons to put at the right place.

You don't need to memorize everything but should still take some time to understand the logic, instead of copying this code without thoughts.

//ST: !
These lines of code *do nothing yet*, because we haven't written anything between the curly braces in the line `(event) -> { }`.

Let's had lines of code which will increase the score by one (+ 1) when the player hits the cookie:

//ST: !
The lines will be:

`score = score + 1;`

`scoreLabel.setText(score + " cookies");`

And they should be placed between the curly braces. What they do is simple:

//ST: !
`score = score + 1;`

-> the variable score gets incremented by one

//ST: !
`scoreLabel.setText(score + " cookies");`

-> the text of the Label showing the score on screen gets updated and will show the score followed by the word "cookies".

Let's place these 2 lines where they should be:

//ST: !
[[cookie-listener]]
.Adding an action listener to the cookie ScaleImageButton
[source,java]
----
cookieCentral.addActionListener(
                (event) -> { // <1>
                  score = score + 1;
                  scoreLabel.setText(score + " cookies");
                } // <1>
        ); // <2>
----
<1> don't forget the opening and closing curly braces!
<2> don't forget to close the parenthesis and the semicolon `;` !
//ST: !
Now, when the user will touch / press the picture of the cookie, the score will increase by one and this new score will be visible on screen:

//ST: !
video::pCo-wKIDc0M[youtube, width="100%", height="400px"]

//ST: !
Congratulations, your app has started coming alive! 🎉

In the next lesson, we will learn how to make the other buttons of the app "do something" when the player clicks on them.

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
