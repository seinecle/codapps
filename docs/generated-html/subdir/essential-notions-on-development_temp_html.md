= CODAPPS: Essential vocabulary and preliminary notions
Clément Levallois <levallois@em-lyon.com>
2017-12-26

last modified: {docdate}

:icons!:
:iconsfont:   font-awesome
:revnumber: 1.0
:example-caption!:
:sourcedir: ../../../../main/java
:source-highlighter:rouge

:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

image::EMLyon_logo_corp.png[width="242" align="center"]
{nbsp} +

//ST: 'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes

== 1. A note on components and actions
//ST: 1. A note on components and actions

//ST: !
==== a. Components

//ST: !
A mobile app can *include* many things. These are like the Lego blocks of our app:

//ST: !
- pictures
- buttons to press
- videos
- places where the user is supposed to write text
- a menu to navigate the app
- etc.

//ST: !
[IMPORTANT]
====
Things included in an app are called *Components*
====

//ST: !
==== b. Actions

//ST: !
And the app is also supposed to *do* many things, for example:

//ST: !
- open a web page when the user clicks a button
- change the picture when the user swaps left
- zoom in when the user double taps on the screen
- make Angry Bird fly when the user plays the game
- etc...

[IMPORTANT]
====
All an app can "do", we will call these *Actions*
====

== 2. The difficulty of naming things
//ST: 2. The difficulty of naming things

//ST: !
When building software like mobile apps, it is important to give precise names to the tools we use.

Often, these names don't make intuitive sense, and this creates an impression of technical difficulty:

//ST: !
image::fun/Zach-Galifianakis-maths.gif[align="center",title="Getting annoyed by the technical vocabulary"]
{nbsp} +

//ST: !
It is not to be annoying, but to make sure we actually don't confuse things and get the proper tool when we need it.
Every domain of specialty, not just programmers, do this.

//ST: !
For instance, the screen of our mobile application is not simply called a screen... why?

//ST: !
1. To build a mobile app, the first Component we need  is an empty region, the size of the screen of the phone, where we will place all other Components.
2. This Component is not called a `Screen`, why ??

//ST: !
[start=3]
3. Because `screen` is a name already taken, to name the phone's actual physical screen (the one that breaks when your phone falls on the ground)
4. So, what name should be given instead to the area an app takes on the screen of the phone: "ScreenApp"? "Region"? "FullSizeAppRegion? EmptyScreenOfTheAppWhereToPutThings"? None of this.

->  The designers of the tool chose the name `*Form*`.

//ST: !
[IMPORTANT]
====
*A Form is the first Component we need when creating a mobile app.*

*It is the empty region of the app where we will place all other Components*.
====

//ST: !
Because of this need for precise names, you will see that:

- adding text to the app, we will use a Component named `*Label*` (not Text)
- adding pictures to the app, we will use a Component named `*Image*` (not Picture)
- adding buttons to the app, we will use a `*Button*` Component (this one is intuitive!)

== 3. Two approaches to work on mobile apps
//ST: 3. Two approaches to work on mobile apps

//ST: !
To sum up what we have seen so far:

- when we start designing an app, we need to create a `Form` first.
- Then we will place Components in the Form: Buttons, Labels, Images, etc.
- Then we can attach actions to each of these components (a "click action" on a button, etc)

//ST: !
How will you do that in practice? There are two ways.

//ST: !
==== a. DIY or the Ikea way?

//ST: !
Building a new mobile app is like building a new piece of furniture : you can build it yourself from scratch, or buy it at Ikea and just assemble it.

//ST: !
Codename One, the framewok we use, gives you these two options: Do It YourSelf (DYI) or Ikea.

- DYI: write the code to create everything in the app.
- IKEA: use a *"Graphical User Interface" (GUI)*, which means you drag and drop things to build the app with a minimum of code to write.

There are different benefits to both approaches:

//ST: !
[cols=3*,options="header"]
|===
|                         | Do It Yourself / writing code| Ikea approach / using a Graphical User Interface (GUI)

| *Benefits*                |Very flexible! You control every parameter since you write everything yourself | Quick and easy! You just drag and drop things, click and point with the mouse, no need to learn how to code.
|===
//ST: !
|===

|*Inconvenients* | You need to learn how to code. Slow since you write everything yourself. | You get stuck at some point: to add features to your mobile app, not everything is in the GUI. Writing code is going to be necessary.

|===


//ST: !
==== b. An example: creating a form by writing code, or with a GUI.

//ST: !
You write the code in NetBeans, in the files of your app. These files are visible here:

//ST: !
image::The-files-of-your-app-visible-in-NetBeans.png[align="center",title="The files of your app visible in NetBeans"]
{nbsp} +

//ST: !
Double click on the file `MyApplication.java` to see its content on the right panel in NetBeans:

//ST: !
image::Opening-the-content-of-MyApplication.java-for-editing.png[align="center",title="Opening the content of MyApplication.java for editing"]
{nbsp} +

//ST: !
When we created the project, an empty screen was added to it by default.

You can see this empty screen by previewing your app (click on the green arrow in NetBeans, or get back to the lesson here)


//ST: !
How was this empty screen added to the app?

Simply with these 2 lines of code in the file `MyApplication.java` (scroll down a bit in NetBeans, as they are in the middle of the file):

//ST: !
.MyApplication.java
[source,java]
----
public void start() {
    if(current != null){
        current.show();
        return;
    }
    Form hi = new Form("Hi World", BoxLayout.y()); <1>
    hi.add(new Label("Hi World"));
    hi.show(); <2>
}
----
<1> This line of code creates the screen
<2> This other line of code causes the screen to appear (otherwise it would remain hidden)



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
        var sc_project = 11563839;
        var sc_invisible = 1;
        var sc_security = "ffa2451a";
        var scJsHost = (("https:" == document.location.protocol) ?
            "https://secure." : "http://www.");
        document.write("<sc" + "ript type='text/javascript' src='" +
            scJsHost +
            "statcounter.com/counter/counter.js'></" + "script>");
    </script>
    <noscript><div class="statcounter"><a title="site stats"
    href="http://statcounter.com/" target="_blank"><img
    class="statcounter"
    src="//c.statcounter.com/11563839/0/ffa2451a/1/" alt="site
    stats"></a></div></noscript>
    <!-- End of StatCounter Code for Default Guide -->]
