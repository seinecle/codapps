= CODAPPS: Using containers
Clément Levallois <levallois@em-lyon.com>
2018-01-15

last modified: {docdate}

:icons!:
:source-highlighter: rouge
:iconsfont:   font-awesome
:revnumber: 1.0
:example-caption!:


:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

image::EMLyon_logo_corp.png[width="242" align="center"]
{nbsp} +

//ST: 'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes


//ST: !
[WARNING]
====
You should have learned the previous lesson on Layouts before starting this one.
====

== 1. Definition of Containers
//ST: 1. Definition of Containers

//ST: !
We introduce the notion of Containers by showing one limit of Forms and Layouts:

Layouts help us organize the space of the Form but... the whole Form gets impacted all at once.

//ST: !
What if we prefer to have, say, the top of the Form organized as a Grid, and the bottom part of the Form organized with a Box Y Layout?

We can't achieve this simply by applying a Layout to a Form. We need different layouts applied to different groups of Components.

*This is what Containers will help us achieve.*

//ST: !
A container is a Component that you can find in the *Core Components*, like the others:

//ST: !
image::Finding-the-Container-among-Core-Components.png[align="center",title="Finding the Container among Core Components"]
{nbsp} +

//ST: !
The difference with other Components is that when you drag and drop a Container on the Form, it remains invisible.

This is normal.

//ST: !
====
*A Container's role is not to show something, but only to help grouping some Components together, so that a Layout can be applied specifically to them.*
====

== 2. Placing Components in and out of Containers
//ST: 2. Placing Components in and out of Containers

//ST: !
Once the Container is dragged and dropped onto the Form, we need to place Components in it (an empty Container has no purpose).

Let's imagine we have 5 Labels in our Form, and then we added a Container:

//ST: !
image::5-labels-and-a-container.png[align="center",title="5 labels and a container"]
{nbsp} +

//ST: !
To move a Label or place it in the Container, we must select it and *use these arrows*:

//ST: !
image::Moving-the-Labels-or-placing-them-in-the-container.png[align="center",title="Moving the Labels or placing them in the container"]
{nbsp} +

//ST: !
image::Showing-the-content-of-a-Container.png[align="center",title="Showing the content of a Container"]
{nbsp} +

//ST: !
If we need to move a Component [underline]#out# of a Container, we must simply:

- select it
- move it up or down until it leaves the Container
- we know the Component has left the Container when it not indented anymore.

//ST: !
All this moving around of Containers and Components is a gymnastics which requests some practice, so *take the time to exercise on simple cases* like the one above.

== 3. Applying a Layout to a Container
//ST: 3. Applying a Layout to a Container

//ST: !
This is straightforward: all you need to do is:

//ST: !
- select your Container,
- click on the icon for layout,
- select the layout you need
- for a definition of each layout, see the previous lesson

//ST: !
These steps shown in the GUI Builder:

//ST: !
image::Applying-a-layout-to-a-container.png[align="center",title="Applying a layout to a container"]
{nbsp} +

//ST: !
The power of Containers comes *when several of them* are in use:  we can apply different layouts to each of them, achieving full flexibility for the design of our app.

== 4. Applying different Layouts to different Containers
//ST: 4. Applying different Layouts to different Containers

//ST: !
Creating several containers on a Form allows to have different layouts applied to different groups of Components on the Form!

//ST: !
To illustrate: what if we want to have this kind of layout on our screen?

//ST: !
image::A-type-of-design-for-an-app.png[align="center",title="A type of design for an app"]
{nbsp} +

//ST: !
We can add several Containers on the Form, place some Components in each of them, and apply different Layouts to each of them.

//ST: !
Spend 5 minutes imagining how many Containers, and what type of Layouts, you'd need to achieve this effect in practice?

You can use a pen and paper to sketch your solution.

//ST: !
Ok? The solution is the following:

//ST: !
- Put the Form in a Border Layout.
- Add a Label for "Learn English with my app!", put it in the North position
- Add a Label for "Open the Dictionary", put it in the South position
- (nothing in West and East positions)

//ST: !
- Add a Container in the Center position (let's call it "Vocabulary Container")
- Apply a Grid Layout to this Container, with 2 rows and 2 columns

//ST: !
- Add 4 new Containers in the Vocabulary Container
- Apply to each of these Containers a "Border" Layout
- In each of these Containers, add a ScaledLabel for the picture in Center position
- In each of these Containers, add a Label for the caption in South position

[NOTE]
====
It might look long and complicated but this is actually nothing unusual for software development: constructing a precise interface takes time and trial and error. *You need to practice*.
====

//ST: !
*This is the end of the third module. You should now be able to:*

//ST: !
1. Style your components from the GUI Builder and from theme.res
2. Be able to quickly switch from the GUI Builder and the file theme.res to update and refresh your styles
3. Understand what a Layout is

//ST: !
[start=4]
4. Play with different layouts
5. Understand what role Containers play
6. Place Components in and out Containers, re-order Components

//ST: !
[start=7]
7. Apply different layouts to different containers
8. With some practice, create exactly the look you need for your app.

//ST: !
You are now well equipped to achieve a very clean design for your apps. Congratulations! 🎉🎉🎉🎉🎉🎉

//ST: !
*In the next module, we are going to learn how to test and release your app for Android an iPhones!*


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
