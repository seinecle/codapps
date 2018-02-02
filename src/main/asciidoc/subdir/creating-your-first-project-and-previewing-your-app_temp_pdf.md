= CODAPPS: Creating a project and previewing your first app
Clément Levallois <levallois@em-lyon.com>
2017-12-26

last modified: {docdate}

:icons!:
:iconsfont:   font-awesome
:revnumber: 1.0
:example-caption!:
:sourcedir: ../../../../main/java

:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

image::EMLyon_logo_corp.png[width="242" align="center"]
{nbsp} +

//ST: 'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes

== 1. Creating a project
//ST: 1. Creating a project

//ST: !
- Open NetBeans
- Click on the second icon from the left:

//ST: !
image::Clicking-on-the-icon-for-new-projects.png[align="center",title="Clicking on the icon for new projects"]
{nbsp} +

//ST: !
- Select a « CodenameOne project »:

image::nb-codenameone-project.png[align="center",title="Selecting a Codename One type of project"]
{nbsp} +
//ST: !


//ST: !
Then click on `Next` to move to the next screen.

//ST: !
- Choose a name and a location for your project. Since the app will be about one of your interests / hobbies, choose in accordance!

[WARNING]
====
*Put no space in the name of your app*

- No special characters like - _# »& @
- No accent marks like é ù à or ñ, etc.
====

//ST: !
image::nb-codenameone-project-name.png[align="center",title="Choosing the name and location of your project"]
{nbsp} +

//ST: !
This will be the administrative name of your app on the app store so please choose it carefully !

Then click on `Next` to move to the next screen:

//ST: !
image::Choosing-the-name-and-location-of-your-project.png[align="center",title="Choosing the name and location of your project"]
{nbsp} +

//ST: !
We will explain in turn what package name, theme and template you should choose:

//ST: !
==== 1. The "package name"

This is the official id of your app. Basically, this is the way for Google or Apple to give an ID card to your app.

It should be unique: one package name for each different app you create.

//ST: !
The package name should contain at least three parts separated by dots. The default value suggested `com.mycompany.myapp`

//ST: !
[WARNING]
====
- *You should change this default value*.
- No special characters like - _# »& @
- No accent marks like é ù à or ñ, etc.
====

//ST: !
You should absolutely have a correct package name as you can't change it later[https://github.com/seinecle/codapps/issues/9]. You will have to delete your app and start again from zero.

//ST: !
How can we find a unique package name for an app?

The convention is to take the name of your website and reverse it:

-> if you build apps for emlyon (www.em-lyon.com), you’d have a package name like : com.emlyon.myfirstapp

//ST: !
If you don’t own a website, you can use the reverse of your email address. If your email is barackobama@gmail.com, your package name could be:

`com.gmail.barackobama.myfirstapp`

//ST: !
==== 2. The "theme"

This defines the general colors and appearance of your app, how it will look like (you’ll be able to modify that later).

//ST: !
Please choose `Native` in the dropdown menu: this means that your app will have an Apple look on iOS, look like Android style on Android phones, etc.

//ST: !
==== 3. The "template"

In the dropdown menu, choose the template « Hello World (Bare Bones) ».

This template allows us to design our app both with by drawing on screen and by programming (coding!).

Other templates would provide us with apps already prebuilt in some ways, we don't use them.

//ST: !
Click on `Finish` and your app will be created.

//ST: !
==== 4. Done! Preview your app.

//ST: !
image::Previewing-your-app.png[align="center",title="Previewing your app"]
{nbsp} +

//ST: !
1. The files of your app appear on the left of your screen in NetBeans.
2. You can launch the preview of your app by clicking on the green arrow image:green-arrow.jpg[]

//ST: !
It should show a blank screen with "Hi World" in the title, and "Hi World" again in the screen:

//ST: !
image::Previewing-your-app.png[align="center",title="Previewing your app"]
{nbsp} +


//ST: !
Congratulations, you started creating your first app and you can already preview it! 🎉

//ST: !
*This is the end of the first module. You should now be able to:*

//ST: !
1. install NetBeans, on Mac or PC (we did not cover Linux but this should work as well)
2. install the Codename One plugin in NetBeans
3. check that the Codename One plugin is up-to-date, if not you should be able to update it.

//ST: !
[start=4]
4. create a first project (your first empty app)
5. launch the preview of your app from NetBeans

//ST: !
*In the next module, we will review some basic notions of software development, and we will learn how to create a new screen for our app!*

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
