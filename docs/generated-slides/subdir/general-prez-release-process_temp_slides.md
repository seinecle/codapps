= CODAPPS: Quick overview to test and release your app
Clément Levallois <levallois@em-lyon.com>
2018-01-22

last modified: {docdate}

:icons!:
:source-highlighter: rouge
:iconsfont: font-awesome
:revnumber: 1.0
:example-caption!:


:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

[.stretch]
image::EMLyon_logo_corp.png[width="242" align="center"]

==  'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes

==  1. Explaining the workflow

==  !
We are developing an app on NetBeans, with a plugin with installed, called "Codename One".

But how do we go from there to an app available on the Play Store (for Android phones and tablets) or Appe's App Store (for iPhones and iPads)?

==  !
The workflow has several steps:

==  !
- we design our app in NetBeans until we are satisfied with it and ready to test it on a phone
- then, we choose in NetBeans if we want to create an Android or an iPhone version of our app.
- we send our app to www.codenameone.com which is the website of the company providing the plugin we use.

==  !
- Codename One transforms our app into an Android app or iPhone app (depending on what we selected). In practice, it is a single file which is created.
- we can download this file on our own phone if we want to test the app.
- or we download this file and place it on the website of the App Store or the Play Store if we want to release the app publicly.

==  !
These steps can be illustrated simply:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vTGa1iw57ePcWS4bT1A0ECBHe0oiM8VDjIv_Bi1VDgi_WcHjj7nfu8qP7XMPkeHJQG3oGXKUEJl6Sux/pub?w=1440&h=1080[align="center","testing or releasing an app for Android or iPhones"]

==  !
So we see that there is a few interconnected parts: NetBeans, the website of Codename One, the app platforms by Google and Apple...

==  !
We present you now the setup you need to test and release your app, common to Android and iPhone app releases.

You will need some additional steps specific either to Google or Apple's app platforms, but we leave these for separate lessons.

==  2. General setup

==  !
==== a. Create a free account on Codename One

==  !
Codename One is the company providing the open source plugin we use in NetBeans.

*Codename One will convert our app into an Android app*. So we need to create an account with them.

==  !
They have several pricing plans:

==  !
- the free plan. It gives you access to everything but puts a *size limit* on your app.
- the basic, pro and entreprise plans, which give extra capabilities.

*In the CODAPPS course we use the free plan*.

==  !
To create your account, go on http://www.codenameone.com[www.codenameone.com] and just *sign up* for an account:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vR1uuMWHdaJXYigqRSJLJ8VrQfgU5PirIF9eTwrCPHr-lNdsQfLxWFz3tD9kTlGe3rmwEjGVoIm2wsx/pub?w=1113&h=602[align="center",title="The codename one website"]

==  !
*Make sure you remember the email and password* you used to sign up as we will need them later.

==  !
==== b. Connect NetBeans to your Codename One account

==  !
In NetBeans, *right click* on the name of your project and select `Properties`:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vR2U-jqeLhKY0TQAJw4416mqnmWkn594MiYhVtBqe6ajfgkwvi_2UbpkNtlODgrGGM27jxagIWp7dYT/pub?w=1124&h=638[align="center",title="Accessing the properties of your project"]

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vQNsfJ5n7XKfCFwrHOVWvSStXTTegqn7VLQhglAKO6DNIW9U7MYDOigiCYvDyc2z0Iug_v95Zwzk4bH/pub?w=1124&h=638[align="center",title="Codename One properties"]

==  !
A login window opens. You should enter *the email and password of the account you created on the Codename One website* (see above in the lesson).

This is how NetBeans will be able to send the app you created to the Codename One website!

==  !
[.stretch]
image::testing-android-3.png[align="center", title="Entering your Codename One credentials"]

==  !
Then close all the windows we opened by clicking on `OK`.


==  !
==== c. Set up your phone to accept apps from unknown sources

==  !
This step is necessary only for testing the app on your phone.
For security reasons, your phone accepts to install only apps coming from official app stores.

*You must unlock this feature so that you can test your own app.*

==  !
The latest versions of your phones might invite you to unlock when you are installing your app, but on older phones you need to do it beforehand:

==  !
- go to the parameters of your phone
- in the security settings, switch on the "install from unknown sources".

This website provides an illustration for Android phones:

==  !
https://www.softwarert.com/install-apps-unknown-sources-android-phones/[https://www.softwarert.com/install-apps-unknown-sources-android-phones/]

(__Depending on your phone and version of Android, your screens will look slightly different__)

[WARNING]
====
Make sure to switch off this parameter after you installed your app.
====

==  !
==== d. Install a QR code reader on your phone

==  !
QR codes are very common and you surely have seen them before, they look like:

==  !
[.stretch]
image::qrcode.png[align="center",title="An example of  QR code"]

==  !
We need an app on our phone to read QR codes, *because this is how we will transfer our app onto our phone* (fancy!).

Just go on the App Store, search "QR code", and install a free app doing QR code reader.


==  !
Apple and Google have two different business strategies for their app stores:

==  !
.Comparing Apple and Google's strategy for their app store
[cols=">s,,"frame="topbot",options="header"]
|======================
|                                                                            |Google's Play Store            |Apple's App Store
|Developer program membership (price to pay)                                 |one time payment of 25$        |90$ every year
|Testing the app on a phone is possible without a membership                 |yes                            |no / difficult
|======================


==  !
[cols=">s,,"frame="topbot",options="header"]
|======================
|                                                             |Google's Play Store            |Apple's App Store
|Policy to accept apps on the Store                           |all apps are welcome           |Apple rejects the app if it does not provide a "valuable" service
|Time to get the app on the Store                             |3 hours                        |several days
|======================

==  !
We see a pattern here:

- Google has an approach where apps are like websites: everyone has the right to publish one, as long as they are legal / not offensive etc. This makes for a very large app store, with apps which are of varying quality.
- Apple has a qualitative, closed approach. They decide who has the right to enter their ecosystem, and they reject what they consider to be "low quality" apps.

==  !
These different strategies have consequences for operational and financial figures:

- Google Play includes a large volume of apps, with low revenues per app (because many apps are simple and non pro)
- Apple's App Store includes fewer apps, but these apps are carefully selected and often made by companies which make revenues from them

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vTu8D_1UD15eBbLetOkhZ7TrPpmFZePNw4mbL0LgbQoGqCrahbpr1SdcRJqkJOvzVnLuZ6DHaQQf-1W/pub?w=1434&h=791[align="center",title="Google and Apple have different strategies for their app stores"]


==  !
And there are consequences for developers like you as well:

- it is relatively easy and cheap to release an app for Android phones and tablets
- it is much trickier to release for Apple's App Store, or even to test your app on your own iPhone!

==  !
The next lessons will guide you through the process of testing and releasing your app in both cases, but be prepared for a longer process in the case of Apple.

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
