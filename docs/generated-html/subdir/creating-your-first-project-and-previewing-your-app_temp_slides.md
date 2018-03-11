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
image::Clicking-on-the-icon-for-new-projects.png[align="center",title="Clicking on the icon for new projects"]


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
image::Choosing-the-name-and-location-of-your-project.png[align="center",title="Choosing the name and location of your project"]


==  !
We will explain in turn what package name, theme and template you should choose:

==  !
==== a. The "package name"

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
You should absolutely have a correct package name as https://github.com/emlyon/codapps/issues/9[you can't change it later].

(you will have to delete your app and start again from zero.)

==  !
How can we find a unique package name for an app?

The convention is to take the name of your website and reverse it:

-> if you build apps for emlyon (www.em-lyon.com), you’d have a package name like : com.emlyon.myfirstapp

==  !
If you don’t own a website, you can use the reverse of your email address. If your email is barackobama@gmail.com, your package name could be:

`com.gmail.barackobama.myfirstapp`

==  !
==== b. The "theme"

This defines the general colors and appearance of your app, how it will look like (you’ll be able to modify that later).

==  !
Please choose `Native` in the dropdown menu: this means that your app will have an Apple look on iOS, look like Android style on Android phones, etc.

==  !
==== c. The "template"

In the dropdown menu, choose the template « Hello World (Bare Bones) ».

This template allows us to design our app both with by drawing on screen and by programming (coding!).

Other templates would provide us with apps already prebuilt in some ways, we don't use them.

==  !
Click on `Finish` and your app will be created.

==  !
==  2. Done! Preview your app.

==  !
[.stretch]
image::Previewing-your-app.png[align="center",title="Previewing your app"]


==  !
1. The files of your app appear on the left of your screen in NetBeans.
2. You can launch the preview of your app by clicking on the green arrow image:green-arrow.jpg[]

==  !
It should show a blank screen with "Hi World" in the title, and "Hi World" again in the screen:

==  !
[.stretch]
image::Previewing-your-app.png[align="center",title="Previewing your app"]


==  !
==  3. Previewing your app on different kinds of phones

==  !
By default, the preview shows how your app would look like on an iPhone 3. It is possible to preview it on any phone you like.

==  !
==== a. Downloading new "skins"

==  !
A phone's appearance is called a `skin`. To add new skins for previewing your apps:

1. Launch the preview
2. Choose the menu "skins"
3. Choose "More..."

==  !
[.stretch]
image::Opening-the-preview-and-the-skins-menu.png[align="center",title="Opening the preview and the skins menu"]


==  !
Then:
1. wait a couple of seconds for the list of available skins to appear
2. Select the one you need. *You can pick several at once*.
3. Click on `download`

==  !
[.stretch]
image::Choosing-the-skins-to-donwload.png[align="center",title="Choosing the skins to donwload"]


==  !
The skin(s) you downloaded are now available. Pick the one you want from the skins menu:

==  !
[.stretch]
image::Applying-a-skin-to-the-preview.png[align="center",title="Applying a skin to the preview"]


==  !
==== b. Adjusting the size of the skin to the screen

==  !
The skins you will choose might be show a preview which is too large to fit on the screen of your computer:

==  !
[.stretch]
image::skins-add-4.png[align="center",title="Most skins don't fit on your computer screen"]


==  !
The solution is *simply to de-select the zoom option* in the menu of the preview:

==  !
[.stretch]
image::skins-dezoom.png[align="center",title="De-select the zoom option in the menu to make your app fit on screen"]



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
Questions? Want to open a discussion on this lesson? Visit the forum https://github.com/emlyon/codapps/issues[here] (need a free Github account).

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
