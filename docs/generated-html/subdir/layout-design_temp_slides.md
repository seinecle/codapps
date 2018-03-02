= CODAPPS: Designing the layout of the app
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

[WARNING]
====
you must have worked and understood the content of Module 5 about *coding* before you can follow this lesson.
====

==  1. Create a new project

==  !
Take the same steps as in https://emlyon.github.io/codapps/generated-html/creating-your-first-project-and-previewing-your-app.html[this lesson in Module 1].


==  1. Creating the main screen of the app

==  !
The main action of the game takes place on a single screen:

==  !
[.stretch]
image::The-design-of-the-cookie-clicker-mobile-app.png[align="center",title="The design of the cookie clicker mobile app"]


==  !
So the first step is to create this screen. *We will not use the GUI Builder for this* (contrary to previous lessons) as it is too slow and unpractical for a complex app like this one.

==  !
=== a. Create a Form with by coding (not with the GUI Builder!)

==  !
Follow these steps:

==  !
[.stretch]
image::Creating-a-Form-with-code.png[align="center", title="Creating a Form with code"]


==  !
In the window which opens, *leave every parameter unchanged* except for the name of the screen:

==  !
[.stretch]
image::Choosing-the-name-of-your-Form.png[align="center", title="Choosing the name of your Form"]


==  !
This creates a file name `Form1.java` (if you chose Form1 as a name).

If you remember the lesson on `methods and classes` in Module 5, you should realize we just created a `class`.

The role of classes is to organize the code in different files and subunits, for a cleaner style of coding.

==  !
At the moment the class is almost empty:

==  !
[.stretch]
image::form-empty.png[align="center",title="The form has been created and is almost empty"]


==  !
In this class, *write or copy paste* 2 lines of code, so that the entire file looks like:

==  !
[[constructor]]
.Creating a function which runs when the Form is instantiated
[source,java]
----
package net.clementlevallois.net.cookieclicker.ultimate; // <1>

public class Form1 {

    public Form1() {  // <2>
    } // <3>

} // <3>
----
<1> of course your package name will be different
<2> the function should have the same name as your class: Form1 in this case.
<3> Don't forget that there are two `}` to close at the end!

==  !
[[constructor-extract-1]]
.What are these two lines we added
[source,java]
----
    public Form1() {  // <1>

    } // <1>
----
<1> anything we write between these 2 curly braces *will be executed when `Form1` is instantiated*.

==  !
So this is a special method: when the class is instantiated, it will run (just once).

Another way to say it is: "when the objet `Form1` is built, this method defines how it is constructed." For this reason it is called a `constructor`.

==  !
Next, let's add our first variable:

==  !
[[constructor]]
.Creating a function which runs when the Form is instantiated
[source,java]
----
package net.clementlevallois.net.cookieclicker.ultimate; // <1>

public class Form1 {
    Resources theme;  // <1>

    public Form1() {
    }

}
----
<1> our first variable! It is an object useful to access the pics we need in the app. We'll use it later

==  !
You should have the same error signal as this one image:error-lightbulb.png[]:

[.stretch]
image::resources-error-import.png[align="center",title="Error when creating a variable of type Resources"]


==  !
Follow the steps to fix the error:

==  !
[.stretch]
image::Importing-the-type.png[align="center",title="Importing the type"]


==  !
The result is a new line added on top: see line 3 here:

[.stretch]
image::import-result.png[align="center",title="a line telling where the type is coming from"]


==  !
What you did is simple:

- you created a variable of type `Resources`, but this type is not included in the basic package of Java (which just includes `String`, `Integer`, etc.)
- We must tell Java *where to find it so that it can import it*:
- we chose `import com.codename1.ui.util.Resources` because the type `Resources` comes from Codename One, indeed.

Finally, let's add a last element:

==  !
[[extend]]
.Adding an info that our class extends another class
[source,java]
----
package net.clementlevallois.net.cookieclicker.ultimate;

import com.codename1.ui.util.Resources;

public class Form1 extends com.codename1.ui.Form {  // <1>
    Resources theme;

    public Form1() {
    }

}
----
<1> we added `extends com.codename1.ui.Form` before the `{`

==  !
What does it mean? We just said that the class we created (`Form1`) *extends* another class, named  `com.codename1.ui.Form`

-> our class `Form1` just inherited of all the methods of the class `Form`!
-> *inherited* means that whatever a `Form` is capable of doing (having Labels in it, be in a BorderLayout or GridLayout, have a title, a background color, etc.), *our class `Form1` inherited these powers and so, it can do it as well!*


==  !
With all this setup done, we can work on the layout we want for our screen.

==  !
=== b. Creating the layout of the Form

==  !
I mentioned that anything written here would be executed when the Form is instantiated:

==  !
[[constructor-extract-1]]
.The constructor of the class Form1
[source,java]
----
    public Form1() {  // <1>

    } // <1>
----
<1> this method will be executed when `Form1` is instantiated

==  !
So we are going to write our layouts there, so that they get into place right when the Form gets created.

I suggest we organize the screen in three big regions:

==  !
[.stretch]
image::The-organization-of-the-screen-in-3-regions.png[align="center",title="The organization of the screen in 3 regions"]


==  !
*Putting the Form in a BorderLayout* (see https://emlyon.github.io/codapps/generated-html/using-layouts.html#_6_the_border_layout[the lesson on the BorderLayout]) will help us divide the screen in these three regions. GridLayout might be another option.

The idea is to have something like this:

==  !
[.stretch]
image::The-organization-of-the-screen-in-3-regions.png[align="center",title="The organization of the screen in 3 regions"]


==  !
Let's define all of this for our Form, with some code:

==  !
[[defining-layouts]]
.Start by creating layouts
[source,java]
----
// these lines of code should go inside  public Form1() { }

//we create the different layouts we will need in this Form:
BorderLayout borderLayout = new BorderLayout();
BoxLayout boxYLayout = BoxLayout.y(); //<1>
BoxLayout boxXLayout = BoxLayout.x(); //<1>
----
<1> weird looking code: what is `BoxLayout.y()` and `BoxLayout.x()`? These are https://emlyon.github.io/codapps/generated-html/classes-and-methods.html#_c_but_not_always_static_methods[static methods], used in a fancy way to do the equivalent of `new BoxLayout()`

==  !
[[put-form-to-border-layout]]
.Choose a BorderLayout for the Form
[source,java]
----
// these lines of code should go inside  public Form1() { }

this.setLayout(borderLayout); // <1>
----
<1> the Form is the file where this code is being written, so we can name it with the keyword `this`. The Form has a method `setLayout` which we can use to switch the Form to a BorderLayout.


==  !
We now have a Form, set in a BorderLayout.
We must put many things in each of the North, Center and South region of the layout.

*To organize things, we'll add a container for each region, and our Components will go inside these containers*:

==  !
[.stretch]
image::Adding-3-containers---one-for-each-region-of-the-Form.png[align="center",title="Adding 3 containers - one for each region of the Form"]


==  !
[[adding-container-north]
.Adding a container to the North region of the Form
[source,java]
----
// these lines of code should go inside  public Form1() { }

//we create a Container that will contain everything in the "North" part of the BorderLayout:
Container northRegion = new Container();

//we choose a BoxY Layout for this container:
northRegion.setLayout(boxYLayout);
----

==  !
[[adding-container-center]]
.Adding a container to the Center region of the Form
[source,java]
----
// these lines of code should go inside  public Form1() { }

//we create a Container that will contain everything in the "Center" part of the BorderLayout:
Container centerRegion = new Container();

//we put this center region in a Box X Layout:
centerRegion.setLayout(boxXLayout);
----


==  !
[[adding-container-south]]
.Adding a container to the South region of the Form
[source,java]
----
// these lines of code should go inside  public Form1() { }

//we create a Container that will contain everything in the "South" part of the BorderLayout:
Container southRegion = new Container();

//we put this container in the south region in a BoxX Layout:
southRegion.setLayout(boxXLayout);
----

==  !
We created several containers, *but it doesn't mean they are in our Form yet*. We need to add them, and tell where they should go:

==  !
[[adding-containers-to-the-form]]
.Adding the containers to the Form
[source,java]
----
// these lines of code should go inside  public Form1() { }
this.addComponent(BorderLayout.NORTH, northRegion);
this.addComponent(BorderLayout.SOUTH, southRegion);
this.addComponent(BorderLayout.CENTER, centerRegion);
----




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
