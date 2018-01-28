= CODAPPS: Using layouts and containers
Clément Levallois <levallois@em-lyon.com>
2018-01-15

last modified: {docdate}

:icons!:
:source-highlighter: rouge
:iconsfont:   font-awesome
:revnumber: 1.0
:example-caption!:
:sourcedir: ../../../../main/java


:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

image::EMLyon_logo_corp.png[width="242" align="center"]
{nbsp} +

//ST: 'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes


== 1. Organizing things on screen: why is it an issue?
//ST: 1. Organizing things on screen: why is it an issue?

//ST: !
So far, we have learned how to put Labels and Buttons onto a Form.
But things are pretty disorganized on the screen.

See what happens when we create an empty Form, and put 5 Labels on it:

//ST: !
image::Putting-5-Labels-on-an-empty-Form.png[align="center",title="Putting 5 Labels on an empty Form"]
{nbsp} +

//ST: !
I delete the title of the Form (which is "Form1" by default):

//ST: !
image::Deleting-the-title-of-the-Form.png[align="center",title="Deleting the title of the Form"]
{nbsp} +

//ST: !
*Make sure to save the GUI Builder (File -> Save)*, you can keep it open. Then launch the preview of the app (big green arrow in NetBeans):

//ST: !
image::layout-2.png[align="center",title="Previewing your app with the default layout"]
{nbsp} +

//ST: !
We see that *by default, the Components are organized from left to right on the screen*.
When there is no more space on the line, the next Components is placed on the line below.

//ST: !
What if we would have preferred to organize the Labels from top to bottom? Or in a mozaic?

//ST: !
The concepts of *Container* and *Layout* are there to provide you with the capacity to organize Components differently, exactly as you want.

These concepts are not specific to the plugin we use in NetBeans.
Pretty much every web or mobile framework use them, or their equivalent.

//ST: !
Before we start explaining what are Containers, Layouts and how they work, let's just answer a question you might have:

Why not just drag and drop Components where we want on the GUI Builder, and this is how the app will look like?

//ST: !
This is indeed tempting. But we must remember that our mobile app will be used on phones and even tablets that each have *different screen sizes and pixel resolutions*.

For this reason, the result we see in the GUI Builder would look different (and messy) on the screen on a small iPhone 3 and on a big Samsung from the latest generation.

//ST: !
Layouts and Containers have precisely been invented to solve this issue of placement of Components, in such a way that we can make sure the overall look of our app will remain stable across screen sizes and resolutions.

//ST: !
A little footnote: the developers of Codename One work hard at cracking this issue of making Layouts easier.

When you create a Form, you can have "AutoLayout" selected: this will smartly help you manage the layout.

//ST: !
But this is still an experimental feature so *do not select* Auto Layout when you create Forms:

//ST: !
image::An-experimental-feature-to-make-layout-easier---but-dont-use-it-yet.png[align="center",title="An experimental feature to make layout easier - but dont use it yet"]
{nbsp} +


//ST: !
With these explanations made, we can discover how layouts and containers work. Let's start with layouts:

== 1. Discovering layouts and using them
//ST: 1. Discovering layouts and using them

//ST: !
A Layout is *a set of rules governing how Components are organized in a region of the screen*.

Codename One, the tool we use in this course, provides 7 different types of Layout.

//ST: !
==== a. The Flow Layout

//ST: !
You already now this one, because when we create a new Form, the "Flow Layout" is applied to it by default:

//ST: !
image::Form-adopt-by-default-a-Flow-layout.png[align="center",title="Form adopt by default a Flow layout"]
{nbsp} +

//ST: !
The Flow Layout is easy to understand: when a Form is set to "Flow Layout", the Components it contains will be set from left to right, and then place on the next line when there is no more room on the screen, etc.

//ST: !
We also learned something there: *a Layout can be applied to some very specific Components: only those which can contain other Components.*

When you think of it it makes complete sense:

//ST: !
- it would be weird to apply a Layout to a Label: since a Label cannot contain anything, it would be nonsensical to organize it in a "Flow Layout" or another Layout.
- a Form is specialized in containing Components: so of course we can apply a Layout to it.

//ST: !
Let's review other useful layouts:

//ST: !
==== b. The Box Y Layout

//ST: !
This one does this:

- every Component will be organized on top of each other, *vertically* (along the Y axis, hence the name)
- every Component will take as much space as it can horizontally.

//ST: !
How to apply to the Form? Simply select the Form and then spot the icon managing Layout parameters:

//ST: !
image::Applying-a-Box-Y-Layout-to-the-Form.png[align="center",title="Applying a Box Y Layout to the Form"]
{nbsp} +

//ST: !
Small digression here: if you remember, when you created the project in NetBeans, a Form had been created automatically with some lines of code.

We had to delete these lines of code to make our Form visible in the app.

Let's look again at what these lines of code where:

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
    hi.show();
}
----
<1> Even if we don't know how to code, this line of code starts to make sense: it creates a new Form, with title "Hi World" and with a Box Y Layout.

//ST: !
(end of the parenthesis and let's explore the next layout in the GUI Builder!)

//ST: !
==== c. The Box X Layout

//ST: !
This Layout is similar to the Box Y Layout, except that this time every Component will be placed horizontally from left to right (along the X axis), and *each Component will take as much space as it can on the vertical axis (this is a difference with the Flow layout):

//ST: !
image::Applying-a-Box-X-Layout-to-the-Form.png[align="center",title="Applying a Box X Layout to the Form"]
{nbsp} +


//ST: !
==== d. The Grid Layout

//ST: !
We will examine last the Grid Layout, as the other layouts are more powerful but also quite complex, so out of scope for this intro course (you are of course free to explore them by yourself, https://www.codenameone.com/manual/basics.html#_flow_layout[looking at the documentation of the plugin here].)

//ST: !
The Grid Layout makes it possible to arrange Components on the screen as a grid (duh!), or tiles / mozaic / table if you prefer.

//ST: !
The logic is simple: you provide a number of columns and rows, and the space of the Form will be divided accordingly.
Each Component will occupy the space of a cell in this table.

//ST: !
For example: 3 rows and 3 columns? 9 cells. If you have less than 9 Components, some cells will remain empty:

//ST: !
image::Applying-a-Grid-Layout-to-the-Form.png[align="center",title="Applying a Grid Layout to the Form"]
{nbsp} +

//ST: !
We leave here the different layouts and move on to the next tool / concept we need to organize the space on the screen exactly as we want it:

== 3. Containers: the tool to organize a Form in subspaces
//ST: 3. Containers: the tool to organize a Form in subspaces

//ST: !
We will introduce the notion of Containers by showing one limit of Forms and Layouts:

Layouts help us organize the space of the Form but... the whole Form gets impacted.

//ST: !
What if we prefer to have, say, the top of the Form organized as a Grid, and the bottom part of th Form organized with a Box Y Layout?

This is what Containers will help us achieve.

//ST: !
Containers are basically a way to group some Components together, so that a Layout can be applied specifically to them.

Creating several containers on a Form allows to have several layouts applied to different regions of a Form!

//ST: !
To illustrate: what if we want to have this kind of layout on our screen?

//ST: !
image::Another-of-a-layout.png[align="center",title="Another of a layout"]
{nbsp} +

//ST: !
What we need is to


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
