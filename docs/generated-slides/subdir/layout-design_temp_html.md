= CODAPPS: Designing the layout of the app
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

[WARNING]
====
you must have worked and understood the content of Module 5 about *coding* before you can follow this lesson.
====

== 1. Create a new project
//ST: 1. Create a new project

//ST: !
Take the same steps as in https://emlyon.github.io/codapps/generated-html/creating-your-first-project-and-previewing-your-app.html[this lesson in Module 1].


== 2. Creating the main screen of the app
//ST: 2. Creating the main screen of the app

//ST: !
The main action of the game takes place on a single screen:

//ST: !
image::The-design-of-the-cookie-clicker-mobile-app.png[align="center",title="The design of the cookie clicker mobile app"]
{nbsp} +

//ST: !
So the first step is to create this screen. *We will not use the GUI Builder for this* (contrary to previous lessons) as it is too slow and unpractical for a complex app like this one.

//ST: !
Follow these steps:

//ST: !
image::Creating-a-Form-with-code.png[align="center", title="Creating a Form with code"]
{nbsp} +

//ST: !
In the window which opens, *leave every parameter unchanged* except for the name of the screen:

//ST: !
image::Choosing-the-name-of-your-Form.png[align="center", title="Choosing the name of your Form"]
{nbsp} +

//ST: !
This creates a file name `Form1.java` (if you chose Form1 as a name).

If you remember the lesson on `methods and classes` in Module 5, you should realize we just created a `class`.

The role of classes is to organize the code in different files and sub-units, for a cleaner style of coding.

//ST: !
At the moment the class is almost empty:

//ST: !
image::form-empty.png[align="center",title="The form has been created and is almost empty"]
{nbsp} +

//ST: !
Let's add a last element to the definition of this class:

//ST: !
[[extend]]
.Adding an info that our class extends another class
[source,java]
----
package net.clementlevallois.net.cookieclicker.ultimate;

public class Form1 extends com.codename1.ui.Form {  // <1>

}
----
<1> we added `extends com.codename1.ui.Form` before the `{`

//ST: !
What does it mean? We just said that the class we created (`Form1`) *extends* another class, named  `com.codename1.ui.Form`

-> our class `Form1` just inherited of all the methods of the class `Form`!
-> *inherited* means that whatever a `Form` is capable of doing (having Labels in it, be in a BorderLayout or GridLayout, have a title, a background color, etc.), *our class `Form1` inherited these methods and so, it can do it as well!*

//ST: !
With all this setup done, we can define the variables we need for our screen.


== 3. Creating Variables
//ST: 3. Creating variables

//ST: !
Next, let's add our first variables:

//ST: !
[[constructor]]
.Creating a function which runs when the Form is instantiated
[source,java]
----
package net.clementlevallois.net.cookieclicker.ultimate;

public class Form1 extends com.codename1.ui.Form {

  Resources theme = Resources.getGlobalResources();  // <1>

}
----
<1> our first variable! It is an object useful to access the pics we imported in the file `themes.res`. It is instantiated with a https://emlyon.github.io/codapps/generated-html/classes-and-methods.html#_c_but_not_always_static_methods[static method].

//ST: !
==== a. Error signal when creating a new variable

//ST: !
You should have the same error signal as this one image:error-lightbulb.png[]:

image::resources-error-import.png[align="center",title="Error when creating a variable of type Resources"]
{nbsp} +

//ST: !
Follow the steps to fix the error:

//ST: !
image::Importing-the-type.png[align="center",title="Importing the type"]
{nbsp} +

//ST: !
The result is a new line `import com.codename1.ui.util.Resources;` near the top of our file:

//ST: !
[import]]
.Adding the import line
[source,java]
----
package net.clementlevallois.net.cookieclicker.ultimate;

import com.codename1.ui.util.Resources;   // <1>

public class Form1 extends com.codename1.ui.Form {

  Resources theme = Resources.getGlobalResources();

}
----
<1> the line NetBeans just added fo us.

//ST: !
What you did is simple:

- you created a variable of type `Resources`, but this type is not included in the basic package of Java (which just includes `String`, `Integer`, etc.)
- We must tell Java *where to find it so that it can import it*:
- we chose `Add import for com.codename1.ui.util.Resources` because the type `Resources` comes from Codename One, indeed.

//ST: !
This error icon will appear each time you use a new type in your code: just click on it and pick "Add import for..."
If you don't see this option available, it probably means there is an error in your code.

//ST: !
==== b. Creating variables for the images we added to `theme.res`

//ST: !
So we'll have pictures in our app.
We import them as usual (see https://emlyon.github.io/codapps/#Module%202[Module 2] via the file `themes.res`:

image::theme-add-pictures.png[align="center",title="The pictures to add to theme.res"]
{nbsp} +

//ST: !
Here is the list of pictures to download so that you can import them:

//ST: !
link::../resources/click_50x64.png[click_50x64.png]

link::../resources/cookie_200x200.png[cookie_200x200.png]

link::../resources/farm_50x37.png[farm_50x37.png]

link::../resources/grandma_50x50.png[grandma_50x50.png]

//ST: !
Once you have imported these pictures, how can we use them in our code?
By creating variables:

//ST: !
[import]]
.Adding the import line
[source,java]
----
package net.clementlevallois.net.cookieclicker.ultimate;

import com.codename1.ui.util.Resources;
import com.codename1.ui.Image;   // <1>

public class Form1 extends com.codename1.ui.Form {

  Resources theme = Resources.getGlobalResources();
  Image farmPic = theme.getImage("farm_50x37.png");
  Image clickPic = theme.getImage("click_50x64.png");
  Image cookieCentraPic = theme.getImage("cookie_200x200.png");
  Image cookiePressedPic = theme.getImage("cookie_200x200_star.png");

}
----
<1> fixing the error signs in the margin image:error-lightbulb.png[] adds this line


== 4. Creating a special method: the "Constructor"
//ST: 4. Creating a special method: the "Constructor"

//ST: !
Still In this class, below the variables we just created, *write 2 lines of code*, so that the entire file looks like:

//ST: !
[[constructor]]
.Creating a function which runs when the Form is instantiated
[source,java]
----
package net.clementlevallois.net.cookieclicker.ultimate;

import com.codename1.ui.util.Resources;
import com.codename1.ui.Image;

public class Form1 extends com.codename1.ui.Form {

    // here  are our variables, I don't rewrite them to save space

    public Form1() {  // <1>
    } // <2>

} // <2>
----
<1> the function should have the same name as your class: `Form1` in this case.
<2> Don't forget that there are two `}` to close at the end!

//ST: !
[[constructor-extract-1]]
.What are these two lines we added: a special method
[source,java]
----
    public Form1() {  // <1>

    } // <1>
----
<1> anything we write between these 2 curly braces *will be executed when `Form1` is instantiated*.

//ST: !
You recognized this as a method. It is a method of a special kind: when the class is instantiated, it will run (just once).

Another way to say it is: "when the objet `Form1` is built, this method defines how it is constructed."
For this reason this method is called a `constructor`.


//ST: !
== 5. Creating the layout of the Form in the constructor
//ST: 5. Creating the layout of the Form in the constructor

//ST: !
I mentioned that anything written here would be executed when the Form is instantiated:

//ST: !
[[constructor-extract-1]]
.The constructor of the class Form1
[source,java]
----
    public Form1() {  // <1>

    } // <1>
----
<1> this method will be executed when `Form1` is instantiated

//ST: !
So we are going to write our layouts there, so that they get into place right when the Form gets created.

I suggest we organize the screen in three big regions:

//ST: !
image::The-organization-of-the-screen-in-3-regions.png[align="center",title="The organization of the screen in 3 regions"]
{nbsp} +

//ST: !
*Putting the Form in a GridLayout* (see https://emlyon.github.io/codapps/generated-html/using-layouts.html#_5_the_grid_layout[the lesson on the GridLayout]) will help us divide the screen in these three regions. BorderLayout might have been another option.

The idea is to have something like this:

//ST: !
image::The-organization-of-the-screen-in-3-regions.png[align="center",title="The organization of the screen in 3 regions"]
{nbsp} +

//ST: !
Let's define all of this for our Form, with some code:

//ST: !
[[defining-layouts]]
.Start by creating layouts
[source,java]
----
// these lines of code should go inside  public Form1() { }

GridLayout gridLayoutThreeByOne = new GridLayout(3, 1); // <1>
this.setLayout(gridLayoutThreeByOne); // <2>
this.setScrollable(false); // <3>
----
//<1> weird looking code: what is `BoxLayout.y()` and `BoxLayout.x()`? These are https://emlyon.github.io/codapps/generated-html/classes-and-methods.html#_c_but_not_always_static_methods[static methods], used in a fancy way to do the equivalent of `new BoxLayout()`
<1> we create a Grid layout: 3 rows, to divide the screen in three equal spaces.
<2> `Form1` is the file where this code is being written, so we can name it with the keyword `this`. The Form has a method `setLayout` which we can use to assign a layout to the Form.
<3> this method says the Form can't be navigated outside of the screen.


//ST: !
We now have a Form, set in a GridLayout.
We must put many things in each of the three rows of the Grid.

*To organize things, we'll add a container for each region, and our Components will go inside these containers*:



//ST: !
image::Adding-3-containers---one-for-each-region-of-the-Form.png[align="center",title="Adding 3 containers - one for each region of the Form"]
{nbsp} +

//ST: !
[[adding-container-north]]
.Adding a container to the North region of the Form
[source,java]
----
// these lines of code should go inside  public Form1() { }

//we create a Container that will contain everything in the "North" part of the BorderLayout:
Container northRegion = new Container();

//we choose a BorderLayout for this container:
BorderLayout borderLayoutNorth = new BorderLayout();
northRegion.setLayout(borderLayoutNorth);
----

//ST: !
[[adding-container-center]]
.Adding a container to the Center region of the Form
[source,java]
----
// these lines of code should go inside  public Form1() { }

//we create a Container that will contain everything in the 2nd row of the screen:
Container centerRegion = new Container();

//we choose a Grid Layout for this container:
GridLayout gridLayoutFourByOne = new GridLayout(4, 1);
centerRegion.setLayout(gridLayoutFourByOne);

//we set this region to be scrollable, because there is too much content to fit
centerRegion.setScrollableY(true);
----


//ST: !
[[adding-container-south]]
.Adding a container to the South region of the Form
[source,java]
----
// these lines of code should go inside  public Form1() { }

//we create a Container that will enclose everything in the 3rd row:
Container southRegion = new Container();

//we choose a Border Layout for this container:
BorderLayout blSouth = new BorderLayout();
southRegion.setLayout(blSouth);
----

//ST: !
We created several containers, *but it doesn't mean they are in our Form yet*.

We need to add them:

//ST: !
[[adding-containers-to-the-form]]
.Adding the containers to the Form
[source,java]
----
// these lines of code should go inside  public Form1() { }
this.addComponent(northRegion);
this.addComponent(centerRegion);
this.addComponent(southRegion);
----

While you write all of this, the new variable types have not been imported yet, so you will see error signals all the way.

Simply click on the error icons and select the first line "Add import for ..." :

//ST: !
image::import-2.png[align="center",title="Error signals - just import the type"]
{nbsp} +

//ST: !
With all this code we have written, the entire file `Form1.java` should look like:

(for your convenience you can also download the file of this Form link:../resources/form-with-layout.txt[here])

<<<

//ST: !
[[Form1-layout]]
.Our Form with the code for the layout
[source,java]
----
package net.clementlevallois.net.cookieclicker.ultimate;

import com.codename1.ui.Container;
import com.codename1.ui.Image;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.util.Resources;

public class Form1 extends com.codename1.ui.Form {

    Resources theme;


    public Form1() {

        theme = Resources.getGlobalResources();

        Image grandmaPic = theme.getImage("grandma_50x50.png");
        Image grandmaBoostIcon = theme.getImage("oven_30x35.png");
        Image farmPic = theme.getImage("farm_50x37.png");
        Image farmBoostIcon = theme.getImage("farm_boost_30x23.png");
        Image clickPic = theme.getImage("click_50x64.png");
        Image clickBoostIcon = theme.getImage("click_30x30.png");
        Image cookieCentraPic = theme.getImage("cookie_200x200.png");
        Image cookiePressedPic = theme.getImage("cookie_200x200_star.png");

        //we put the Form in a Grid layout: 3 rows, to divide the screen in three equal spaces.
        GridLayout gridLayoutThreeByOne = new GridLayout(3, 1);
        this.setLayout(gridLayoutThreeByOne);

        //we don't want the screen to be scrollable: everything should fit in it.
        this.setScrollable(false);

        //we create a Container that will contain everything in the "North" part of the BorderLayout:
        Container northRegion = new Container();

        //we choose a Border Layout for this container:
        BorderLayout borderLayoutNorth = new BorderLayout();
        northRegion.setLayout(borderLayoutNorth);


        //we create a Container that will contain everything in the "Center" part of the screen:
        Container centerRegion = new Container();

        //we choose a Grid Layout for this container:
        GridLayout gridLayoutFourByOne = new GridLayout(4, 1);
        centerRegion.setLayout(gridLayoutFourByOne);

        //we set this region to be scrollable, because there is too much content to fit
        centerRegion.setScrollableY(true);

        //we create a Container that will contain everything in the "South" part of the BorderLayout:
        Container southRegion = new Container();

        //we choose a Border Layout for this container:
        BorderLayout blSouth = new BorderLayout();
        southRegion.setLayout(blSouth);

        // we add the three containers to the Form, which is in a Gridlayout (three rows)

        // The northRegion will be in the top row because we add it first,
        // The centerRegion will be in the 2nd row because we add it in second
        // The southRegion will be in the 3rd row because we add it last.
        this.addComponent(northRegion);
        this.addComponent(centerRegion);
        this.addComponent(southRegion);
    }
}
----

== 6. Instantiating this Form when the app launches

//ST: !
Just like we did since the beginning of this course, we need now to add a couple of lines of code in MyApplication.java so that our `Form1` opens when the app starts:


//ST: !
[[instantiating-the-form]]
.Instantiating the Form with 2 lines in MyApplication.java
[source,java]
----
public void start() {
    if(current != null){
        current.show();
        return;
    }
    Form1 mainScreen = new Form1();// <1>
    mainScreen.show();// <2>
}
----
<1> we instantiante `Form1` ! This will trigger the constructor of Form1, so our layout defined with code in it will be created!
<2> we show the Form on the screen.

//ST: !
If you click on the preview image:green-arrow.jpg[] you will see your app:

//ST: !
image::layout-preview-1.png[align="center",title="Previewing your app- the layout is there but still nothing in it!"]
{nbsp} +

//ST: !
Still empty?
Yes, but it is ready to include pictures, buttons and text! Let's do this in the next lesson.

== The end
//ST: The end

//ST: !
Questions? Want to open a discussion on this lesson? Visit the forum https://github.com/emlyon/codapps/issues[here] (need a free Github account).

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
