= CODAPPS: Creating a project and previewing your first app
Clément Levallois <levallois@em-lyon.com>
2017-12-26

last modified: {docdate}

:icons!:
:iconsfont:   font-awesome
:revnumber: 1.0
:example-caption!:

:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

[.stretch]
image::EMLyon_logo_corp.png[width="242" align="center"]

==  'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes

==  1. Creating a project

==  !
- Open NetBeans
- Click on the second icon from the left:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vSvRqMTjZdYdJNiPxPV3EKeQnouO1Nea5Ug4LBQE7sfIKe2vrhCuiVDMxWP8xNOcF1BRDjcXXqizlrx/pub?w=999&h=623[align="center",title="Clicking on the icon for new projects"]

==  !
- Select a « CodenameOne project »:

[.stretch]
image::nb-codenameone-project.png[align="center",title="Selecting a Codename One type of project"]
==  !


==  !
Then click on `Next` to move to the next screen.

==  !
- Choose a name and a location for your project. Since the app will be about one of your interests / hobbies, choose in accordance!

[WARNING]
====
*Put no space in the name of your app*

- No special characters like - _# »& @
- No accent marks like é ù à or ñ, etc.
====

==  !
[.stretch]
image::nb-codenameone-project-name.png[align="center",title="Choosing the name and location of your project"]

==  !
This will be the administrative name of your app on the app store so please choose it carefully !

Then click on `Next` to move to the next screen:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vScQAHg2o2koZ0pcTn32YYw_AloTy6nineYPiusdo5ogQuGbRZol0Ljix9t2paUpqbps3-CUGu2zYDR/pub?w=1440&h=1080[align="center",title="Choosing the name and location of your project"]

==  !
We will explain in turn what package name, theme and template you should choose:

==  !
==== 1. The "package name"

This is the official id of your app. Basically, this is the way for Google or Apple to give an ID card to your app.

It should be unique: one package name for each different app you create.

==  !
The package name should contain at least three parts separated by dots. The default value suggested `com.mycompany.myapp`

==  !
[WARNING]
====
- *You should change this default value*.
- No special characters like - _# »& @
- No accent marks like é ù à or ñ, etc.
====

==  !
You should absolutely have a correct package name as you can't change it later[https://github.com/seinecle/codapps/issues/9]. You will have to delete your app and start again from zero.

==  !
How can we find a unique package name for an app?

The convention is to take the name of your website and reverse it:

-> if you build apps for emlyon (www.em-lyon.com), you’d have a package name like : com.emlyon.myfirstapp

==  !
If you don’t own a website, you can use the reverse of your email address. If your email is barackobama@gmail.com, your package name could be:

`com.gmail.barackobama.myfirstapp`

==  !
==== 2. The "theme"

This defines the general colors and appearance of your app, how it will look like (you’ll be able to modify that later).

==  !
Please choose `Native` in the dropdown menu: this means that your app will have an Apple look on iOS, look like Android style on Android phones, etc.

==  !
==== 3. The "template"

In the dropdown menu, choose the template « Hello World (Bare Bones) ».

This template allows us to design our app both with by drawing on screen and by programming (coding!).

Other templates would provide us with apps already prebuilt in some ways, we don't use them.

==  !
Click on `Finish` and your app will be created.

==  !
==== 4. Done! Preview your app.

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vTq1eyMFdbYtX7AP5x5C9oKeK3uuxe9j_JqYQqjHV1hzjaqpdGsvQmKRniQFFa4x1GEQ2LYfbsrtMNP/pub?w=1076&h=760[align="center",title="Previewing your app"]

==  !
1. The files of your app appear on the left of your screen in NetBeans.
2. You can launch the preview of your app by clicking on the green arrow image:green-arrow.jpg[]

==  !
It should show a blank screen with "Hi World" in the title, and "Hi World" again in the screen:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vQsRlTI_wir2DjMptV54byD2hzWp30T74nuE4eOpl46d8rg4UorDCJFP0DADKpeb5pkgFe92PX5nqse/pub?w=216&h=381[align="center",title="Previewing your app"]


==  !
Congratulations, you started creating your first app and you can already preview it! 🎉

==  !
*This is the end of the first module. You should now be able to:*

==  !
1. install NetBeans, on Mac or PC (we did not cover Linux but this should work as well)
2. install the Codename One plugin in NetBeans
3. check that the Codename One plugin is up-to-date, if not you should be able to update it.

==  !
[start=4]
4. create a first project (your first empty app)
5. launch the preview of your app from NetBeans

==  !
*In the next module, we will review some basic notions of software development, and we will learn how to create a new screen for our app!*

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
