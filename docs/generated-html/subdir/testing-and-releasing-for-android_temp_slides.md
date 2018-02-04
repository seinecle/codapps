= CODAPPS: Testing and releasing your app for Android
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

==  1. Preliminary setup

==  !
[WARNING]
====
Before doing this lesson you must have completed the first lesson of this module, because it includes essential steps.
====

==  !
Testing and releasing mobile apps for Android phones and tablets is fairly simple, and made even simpler by Codename One, the tool we use in this course.

Here is the list of what you'll need:


==  !
==== b. Create A developer account on Google's Play Store (25$)

==  !
You don't need this step if you just want to test your app on your own Android phone.

[NOTE]
====
em *lyon business school* students: we provide you with a free access to a Google Play Store account.

You will receive the invitation by email. You can ignore this and move on to the next part of this lesson.
====

==  !
To release your app on the Play Store, you need to create an account.

Visit the webpage to sign up for a Google Play developer account: https://play.google.com/apps/publish/signup[https://play.google.com/apps/publish/signup].

==  !
A one-time *25$ fee for a lifetime membership* to the Google Developer Program is requested.

With this fee you can distribute an unlimited number of apps, without limit of time.

==  !
==== c. Set up your phone to accept apps from unknown sources

==  !
This step is necessary only for testing the app on your phone.
For security reasons, your phone accepts to install only apps coming from the Google Play Store.

*You must unlock this feature so that you can test your own app.*

==  !
The latest versions of Android will invite you to unlock when you are installing your app, but on older phones you need to do it beforehand:

==  !
- go to the parameters of your phone
- in the security settings, switch on the "install from unknown sources".

This website provides an illustration:

==  !
https://www.softwarert.com/install-apps-unknown-sources-android-phones/[https://www.softwarert.com/install-apps-unknown-sources-android-phones/]

(__Depending on your phone and version of Android, your screens will look slightly different__)

[WARNING]
====
Make sure to switch off this parameter after you installed your app.
====

==  !
==== e. Connect NetBeans to your Codename One account

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
You are almost ready to send your app to Codename One.

The last step consists in generating a Google certificate for your app.

==  !
==== f. Generate a Google certificate for the app

==  !
A certificate is the unique and "tamperproof" ID of your app. It is used by Google to make sure that your app is indeed the one it claims to be, and not one corrupted by a third party.

==  !
Generating certificates can be a long and painful process (watch the lesson on certificates for iPhone apps and cry...). Luckily, Google's process is simpler, and Codename One makes it even simpler.

Follow these steps:

==  !
Return to the `Properties` of your project:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vR2U-jqeLhKY0TQAJw4416mqnmWkn594MiYhVtBqe6ajfgkwvi_2UbpkNtlODgrGGM27jxagIWp7dYT/pub?w=1124&h=638[align="center",title="Accessing the properties of your project"]

==  !
You can now access the Android settings of your project. *Be extra careful in following these instructions* as mistakes are particularly frustrating to debug:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vTDTzagRutzHUrqYDRNXrkG3IrGc8wLffsjgaByrTiFqOJmrXdnWZ913uO2K1O__NG43B8NTnZY5twV/pub?w=1124&h=638[align="center",title="Android properties of your project"]

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vRYCv8H7IzJIWxZhh5AmSvyiGeYgzXlZVvpxQm6pBG1_lmi_OJPnBdovuF9pf0xvlwebgsY0skuG-_F/pub?w=1124&h=638[align="center",title="Generating a certificate"]

==  !
Your Google certificate is now generated! Close the properties of the project by clicking on `OK` and be ready to create the Android version of your app!

==  Launching the build

==  !
With all the setup completed, we are nearly finished.

Launch the build of the Android app by right clicking on your project's name:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vQaeosAZWaAnFnfksQD3AsDpZT_8WlsjCV6ysrvpG1BrH35dOj7MKsspzItbs3LDuV0UQcYY2zhzOEK/pub?w=1124&h=638[align="center",title="Launching the Android build"]

==  !
If you get a "Build failed" message at the end, don't worry this is very common not to succeed at the first time.

Read the lesson in this module about possible causes and solutions.

If you get a successful build, continue here:

==  !
Now you should open your web browser, go to http://www.codenameone.com[http://www.codenameone.com] and login to your account.

Then go to the Dashboard:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vRt5pn7XtJ08RdO3IQp2GybVFwJ78DnqsFnqXqs_hdJF6UXKJdbNXNV-AwAXMr31mzIper1sr5pTM0L/pub?w=1124&h=638[align="center",title="Checking the result on the website of Codename One"]

==  !
If the build is green and successful, you can go ahead and follow the next instructions below.

If it is red, again this is quite usual the first times. You can read the special lesson in this module to help you diagnostic and solve the error.

==  !
Ok, assuming your build was successful and "green", click on *the date and time* shown on it:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vSWiQz6G6d-PWmVv9P4T59jI8t9Ph5BVzHUeL9bn1WIN9mlrgZEKhQhzGMJp9KVjNbXe-qGcTaPo2gY/pub?w=1124&h=638[align="center",title="Revealing the QR code and the download options"]

==  !
And now, you can simply test your app on your Android phone, or publish it on Google's Play Store.

Let's see how:

==  3. Testing the app on an Android Phone

==  !
- Take your phone and open the QR code reader app that you installed on it.
- Flash the QR code displayed on your successful build on www.codenameone.com.
- Your app should install on your phone (follow the steps / confirm)
- go and find the icon of your app on your phone, open it and enjoy it!

==  4. Publishing your app on Google's Play Store

==  !
Download the "apk" file on your computer. This file is your Android app!

(if you are curious, `apk` stands for `Android package`)

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vRrWlwetQeZ_yQOXFJ15yvT05SjcQXCV4nl_BXvy09K9Ql7GtQXti1ucZNltAceNKTO2lVLpzw6vJ3v/pub?w=1124&h=638[align="center",title="Downloading the apk file to your computer"]

==  !
Now, login to your Google Play Developer account at https://play.google.com/apps/publish[https://play.google.com/apps/publish]

- we created this Google Play Console account in one of the steps above
- *em lyon business school students*: log in to your account by following the instuctions you received by email.

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vTXrE1Y1AchhDJMOR8lEBPaChaC5dlxK5mi9FXvNjod_NVuCa4mLGr801fz0Fcz_dyTkjNhfv1QE7C7/pub?w=1124&h=638[align="center",title="Creating a new app on your Google Play Console"]

==  !
You now have access to the menu for your app.

Upload your apk here:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vRzNQ_99QLcjOYA_ClU4Fki_RzgL3n7n8wVCuI4pwq1i0WzEsD-ZXVJlsfuDHy_ekJcKZtkAx1Vg0Cj/pub?w=1124&h=638[align="center",title="Upload your apk here"]

==  !
The Play Store now requires that you add screenshots of your app to market it.

There are a number of screenshots of you app to create and upload, each at  precise pixel size. You will find https://support.google.com/googleplay/android-developer/answer/1078870?hl=en[help and indications here].

This website might also be useful to create the screenshots: http://www.appscreenshot.me/

==  !
Finally, there are a number of parameters for you to set. They are shown with an "alert sign" icon on your page:

==  !
[.stretch]
image::https://docs.google.com/drawings/d/e/2PACX-1vRrpx-KEEERAdW7YcGcGDBzYrPYyZA8-NXQcsf2Rd9HuM7WHoQgbarDl6tKraQgjGDmmg0CS634t9dT/pub?w=1124&h=638[align="center",title="Visit and set every parameter flagged with an icon"]

==  !
When all these parameters will be set, your app will become publishable.


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
