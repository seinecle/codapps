= CODAPPS: Making the cookie click
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

==  1. Storing the numbers about the price and productivity of cookie production tools

==  !
In the following, we are going to work on adding the auto-click, grandma, and farms tools in the game.

- the autoclick clicks on the cookie once every 10 seconds
- grandmas bake 1 cookie per second
- farms produce 3 cookies per second

==  !
Autoclick, grandmas and farms have a price: you need to spend your cookies to buy them.
So if a grandma costs 100 cookies and your score is 100, you go back to zero cookie when you buy a grandma.

==  !
Also: *the price and productivity of these tools is evolving*: the more grandmas you buy, the more expensive they get. Each new grandma is also more productive than the preceding one you bought.

Same for auto-clicks and farms.

==  !
So that makes a long list of variables to track!

-> price and productivity for each tool, and number of tools owned.

==  !
We could create all these variables in our class `Form1`, but it will be more convenient to store all this in a separate class (a separate file). Let's call it "Parameters" and create it:

==  !
[.stretch]
image::Creating-a-Form-with-code.png[align="center", title="Creating a Form with code"]


==  !
In the window which opens, leave every parameter unchanged *except for the [underline]#"Class Name"# where you write `Parameters`*, and click `Finish`

==  !
[.stretch]
image::parameters-class-creation.png[align="center",title="Creating a new class called Parameters"]


==  !
This creates an empty class like this one:

==  !
[.stretch]
image::parameters-class-empty.png[align="center",title="The class Parameters, still empty"]



==  !
In this class, we will define all the variables that will store the numbers we need:

==  !
[[parameters-variables]]
.Parameters for the cookie clicker app
[source,java]
----
// for grandmas: their productivity per second, price, and number owned by the player
float grandmaProd = 1f;
float grandmaPrice = 100f;
int grandmaOwned = 0;

// for autoclicks: their productivity per second, price, number owned by the player, and seconds between each auto-click
float autoclickProd = 1f;
float autoclickPrice = 15f;
int autoclickOwned = 0;
float autoclickPeriod = 10f;

// for farms: their productivity per second, price, and number owned by the player
float farmProd = 3f;
float farmPrice = 500f;
int farmOwned = 0;

// for all tools: when the player buys a new one, what is the rate of increase of their price and productivity?
float rateIncreasePrice = 1.3f;
float rateIncreaseProd = 1.2f;
----

==  !
The entire file will look like this:

==  !
[.stretch]
image::parameters-class-with-variables.png[align="center",title="variables added to the class Parameters"]


==  !
Nice! How can our code in the file `Form1` use these variables?
Very simply:

==  !
1. We go back to our class `Form1`
2. We define a variable `myParameters` of type `Parameters`, and we instantiate it.
3. That's it. If we need to use the number of farms owned by the players, we will simply write `myParameters.farmOwned`. Done!

See below:

==  !
[[using-parameters-in-Form1]]
.Using parameters in Form1
[source,java]
----
public class Form1 extends com.codename1.ui.Form { //<1>
    Resources theme = Resources.getGlobalResources(); //<1>
    float score = 0f; //<1>
    Parameters myParameters = new Parameters(); //<2>

----
<1> the lines we have already written at the beginning of the file Form1
<2> * the line we add*

==  !
With all these parameters defined and available to use in `Form1`, we can now add some code to make our buttons click and do stuff:


==  2. Making the Auto click, the grandma and the farm buttons "clickable"

==  !
Just to recap, this is our app so far:

==  !
[.stretch]
image::cookie-clicker-screenshot-1.png[align="center",title="Our app so far", width="350px"]


==  !
The player can click on the cookie and this will increase the score by one.
*But when the player clicks on any of the tools (auto-click, grandma, farm), nothing happens*.

==  !
To make the cookie clickable, we had added an addActionListener method to the `ScaleImageButton` of the cookie. *We'll do the same for each of the tools.*

*The difference is that tools have more features:*

==  !
1. the player must have enough cookies to buy them.
2. since the player buys one tool, we must increase by one the number of this tool owned by the player
3. the score of the player must be decreased when the tool is bought (if the player has 100 cookies and the grandma costs 100, the score must go to zero).
4. the price and productivity of *the next tool* that the player will purchase must increase
5. we must be update the label showing how many tools the player owns and the price of the next copy of the tool
6. we must update the label showing the score

==  !
Let's do this for the Auto click tool first:

==  !
==== a. Making the AutoClick button work

==  !
All of this can be done with these lines of code:

==  !
[[actionListener-autoclick]]
.Adding an action listener to the autoclick button
[source,java]
----
cookieCentral.addActionListener( // <1>
        (event) -> { // <1>
            score = score + 1; // <1>
            scoreLabel.setText(score + " cookies"); // <1>
        } // <1>
); // <1>

autoclickButton.addActionListener( // <2>
        (event) -> {
            if (score >= myParameters.autoclickPrice) {
                myParameters.autoclickOwned = myParameters.autoclickOwned + 1;
                score = score - myParameters.autoclickPrice;
                myParameters.autoclickProd = myParameters.autoclickProd * myParameters.rateIncreaseProd;
                myParameters.autoclickPrice = myParameters.autoclickPrice * myParameters.rateIncreasePrice;
                autoclickButton.setTextLine4("price: " + myParameters.autoclickPrice + " cookies. Owned: " + myParameters.autoclickOwned + ".");
                scoreLabel.setText(score + " cookies");
            }
        }
); // <2>
----
<1> the code we had already written to make the cookie clickable, for reference (don't write it again!)
<2> *all the lines we add to make the autoclick button working*

==  !
*Notes: of course these lines are intimidating.*

But have a careful look at them, taking note of where the curly braces open and close: you will see that they do exactly what the points 1. to 4. above have described:

==  !
[[actionListener-autoclick-details]]
.Adding an action listener to the autoclick button - with comments
[source,java]
----
autoclickButton.addActionListener(
        (event) -> {
            if (score >= myParameters.autoclickPrice) {  // <1>
                myParameters.autoclickOwned = myParameters.autoclickOwned + 1;  // <2>
                score = score - myParameters.autoclickPrice;  // <3>                }
                myParameters.autoclickProd = myParameters.autoclickProd * myParameters.rateIncreaseProd;  // <4>
                myParameters.autoclickPrice = myParameters.autoclickPrice * myParameters.rateIncreasePrice;  // <4>
                autoclickButton.setTextLine4("price: " + myParameters.autoclickPrice + " cookies. Owned: " + myParameters.autoclickOwned + ".");  // <5>
                scoreLabel.setText(score + " cookies"); // <6>
            }
        }
);
----
<1> the player must have enough cookies to buy them. If not, the button does nothing (the lines of code following the `{` will not be executed).
<2> since the player buys one tool, we must increase by one the number of this tool owned by the player
<3> the score of the player must be decreased when the tool is bought (if the player has 100 cookies and the grandma costs 100, the score must go to zero).
<4> we increase the price and productivity of *the next tool* that the player will purchase
<5> we must be update the label showing how many tools the player owns and the price of the next copy of the tool
<6> we must update the label showing the score

==  !
Launch the preview, and test the app: the player can now buy an auto-clicker for the price of 15 cookies:

==  !
video::sjH6PZ5HcqQ[youtube, width="100%", height="400px"]

==  !
Exactly the same logic applies for the grandma button and the farm button.

==  !
==== b. Making the Grandma and Farm buttons work

==  !
Just add these lines of code:

==  !
[[actionListener-grandma-and-farm]]
.Adding an action listener to the grandma button and the farm button
[source,java]
----
grandmaButton.addActionListener(
        (event) -> {
            if (score >= myParameters.grandmaPrice) {
                myParameters.grandmaOwned = myParameters.grandmaOwned + 1;
                score = score - myParameters.grandmaPrice;
                myParameters.grandmaProd = myParameters.grandmaProd * myParameters.rateIncreaseProd;
                myParameters.grandmaPrice = myParameters.grandmaPrice * myParameters.rateIncreasePrice;
                grandmaButton.setTextLine4("price: " + myParameters.grandmaPrice + " cookies. Owned: " + myParameters.grandmaOwned + ".");
                scoreLabel.setText(score + " cookies");
            }
        }
);

farmButton.addActionListener(
        (event) -> {
            if (score >= myParameters.farmPrice) {
                myParameters.farmOwned = myParameters.farmOwned + 1;
                score = score - myParameters.farmPrice;
                myParameters.farmProd = myParameters.farmProd * myParameters.rateIncreaseProd;
                myParameters.farmPrice = myParameters.farmPrice * myParameters.rateIncreasePrice;
                farmButton.setTextLine4("price: " + myParameters.farmPrice + " cookies. Owned: " + myParameters.farmOwned + ".");
                scoreLabel.setText(score + " cookies");
            }
        }
);
----

==  !
==== c. The result so far

==  !
The result is a game app where the player can buy three tools to increase the cookie production - if they have enough cookies!

==  !
video::424CS-oUt38[youtube, width="100%", height="400px"]

==  !
Congratulations, all the buttons of your app are now working and "do something"!

In the next and last lesson, we will see how the score of the player can update on screen.

==  The end

==  !
Questions? Want to open a discussion on this lesson? Visit the forum https://github.com/emlyon/codapps/issues[here] (need a free Github account).

==  !
Find references for this lesson, and other lessons, https://emlyon.github.io/codapps/[here].

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
