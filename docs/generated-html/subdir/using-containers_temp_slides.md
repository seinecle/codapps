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

[.stretch]
image::EMLyon_logo_corp.png[width="242" align="center"]

==  'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes


==  !
[WARNING]
====
You should have learned the previous lesson on Layouts before starting this one.
====

==  1. Definition of Containers

==  !
We introduce the notion of Containers by showing one limit of Forms and Layouts:

Layouts help us organize the space of the Form but... the whole Form gets impacted all at once.

==  !
What if we prefer to have, say, the top of the Form organized as a Grid, and the bottom part of the Form organized with a Box Y Layout?

We can't achieve this simply by applying a Layout to a Form. We need different layouts applied to different groups of Components.

*This is what Containers will help us achieve.*

==  !
A container is a Component that you can find in the *Core Components*, like the others:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vTZilzT-i-pousY6xCia7BW3gXUIRyp0rIvbiJs1RGwIvpB9CJyI7Z-ILdF7cukkC4dBpF9Ca9JQWoN/pub?w=1434&h=791[align="center",title="Finding the Container among Core Components"]

==  !
The difference with other Components is that when you drag and drop a Container on the Form, it remains invisible.

This is normal.

==  !
====
*A Container's role is not to show something, but only to help grouping some Components together, so that a Layout can be applied specifically to them.*
====

==  2. Placing Components in and out of Containers

==  !
Once the Container is dragged and dropped onto the Form, we need to place Components in it (an empty Container has no purpose).

Let's imagine we have 5 Labels in our Form, and then we added a Container:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vRvtljHinE4t9A5_oFNZECm54T6-owU9fb5jTPi9Q00YkjHv8UZ0pMXA6BZe3o729Pw2bqOkym1vNrr/pub?w=1434&h=791[align="center",title="5 labels and a container"]

==  !
To move a Label or place it in the Container, we must select it and *use these arrows*:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vR3JP6_knWh0nnTwnYYUI-GNxxrJwsPN7W0cimF91XkT8dxtBFZURdJn1sj5j3uvme_AFjXxM2XxZsM/pub?w=1434&h=791[align="center",title="Moving the Labels or placing them in the container"]

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vSHUIfg0oK526Z4POh2IAjLx1CUSfqh3qgYaSBHyG4v8vcSGdLVPSJdBk-iLH8yajtX_Z1BU75NIGQ7/pub?w=1434&h=791[align="center",title="Showing the content of a Container"]

==  !
If we need to move a Component [underline]#out# of a Container, we must simply:

- select it
- move it up or down until it leaves the Container
- we know the Component has left the Container when it not indented anymore.

==  !
All this moving around of Containers and Components is a gymnastics which requests some practice, so *take the time to exercise on simple cases* like the one above.

==  3. Applying a Layout to a Container

==  !
This is straightforward: all you need to do is:

==  !
- select your Container,
- click on the icon for layout,
- select the layout you need
- for a definition of each layout, see the previous lesson

==  !
These steps shown in the GUI Builder:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vSBhhvm7fh__imFOF20IkRiKUfAvCiXf0t8jdIJFwa84-ih74GE8LCZ8jWtfnFHBw0CFQKLivat-Uds/pub?w=1434&h=791[align="center",title="Applying a layout to a container"]

==  !
The power of Containers comes *when several of them* are in use:  we can apply different layouts to each of them, achieving full flexibility for the design of our app.

==  4. Applying different Layouts to different Containers

==  !
Creating several containers on a Form allows to have different layouts applied to different groups of Components on the Form!

==  !
To illustrate: what if we want to have this kind of layout on our screen?

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vQxEvhooS8XQRc2h6LVplpq1LNF1R6Rs8JvJVOVDROYbZVa9OuEXOOFQRmXPPP0pn2Ck9QH4q-OY_F0/pub?w=453&h=575[align="center",title="A type of design for an app"]

==  !
We can add several Containers on the Form, place some Components in each of them, and apply different Layouts to each of them.

==  !
Spend 5 minutes imagining how many Containers, and what type of Layouts, you'd need to achieve this effect in practice?

You can use a pen and paper to sketch your solution.

==  !
Ok? The solution is the following:

==  !
- Put the Form in a Border Layout.
- Add a Label for "Learn English with my app!", put it in the North position
- Add a Label for "Open the Dictionary", put it in the South position
- (nothing in West and East positions)

==  !
- Add a Container in the Center position (let's call it "Vocabulary Container")
- Apply a Grid Layout to this Container, with 2 rows and 2 columns

==  !
- Add 4 new Containers in the Vocabulary Container
- Apply to each of these Containers a "Border" Layout
- In each of these Containers, add a ScaledLabel for the picture in Center position
- In each of these Containers, add a Label for the caption in South position

[NOTE]
====
It might look long and complicated but this is actually nothing unusual for software development: constructing a precise interface takes time and trial and error. *You need to practice*.
====

==  !
*This is the end of the third module. You should now be able to:*

==  !
1. Style your components from the GUI Builder and from theme.res
2. Be able to quickly switch from the GUI Builder and the file theme.res to update and refresh your styles
3. Understand what a Layout is

==  !
[start=4]
4. Play with different layouts
5. Understand what role Containers play
6. Place Components in and out Containers, re-order Components

==  !
[start=7]
7. Apply different layouts to different containers
8. With some practice, create exactly the look you need for your app.

==  !
You are now well equipped to achieve a very clean design for your apps. Congratulations! 🎉🎉🎉🎉🎉🎉

==  !
*In the next module, we are going to learn how to test and release your app for Android an iPhones!*


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
