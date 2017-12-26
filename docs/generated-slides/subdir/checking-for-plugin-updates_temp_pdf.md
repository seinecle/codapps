= CODAPPS: Checking for plugin updates
Clément Levallois <levallois@em-lyon.com>
2017-12-13

last modified: {docdate}

:icons!:
:iconsfont:   font-awesome
:revnumber: 1.0
:example-caption!:
:sourcedir: ../../../main/java

:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

image::EMLyon_logo_corp.png[width="242" align="center"]
{nbsp} +

//ST: 'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes

== 1. Notifications for updates
//ST: 1. Notifications for updates
//ST: !

The Codename One plugin is the tool that enables us to apps with NetBeans.

You have installed the plugin, but the creators of the plugin continue to make it evolve, adding new functionalities to it.

//ST: !
It is important to have the latest version of the plugin installed.

When you open NetBeans, it actually checks for you if there is any update available:

//ST: !
image::Update-available.png[align="center",title="Update available"]
{nbsp} +

//ST: !
If there is a notification, it means updates are available. Click on the bubble and follow the instructions to download and install the updates.

//ST: !
You can have updates for the Codename One plugin, but also for other components of NetBeans you are not familiar with.

I advise you to install all the updates available.

== 2. Propagating the update to existing projects
//ST: 2. Propagating the update to existing projects
//ST: !

Now, what if you already had created an app in NetBeans? *It will not automatically benefit from the updated plugin*.

Follow these steps:

//ST: !
a.	Right click on the project’s name, select 'Properties'
b.	In the window that opens, click on “Update project libs”. Close the window
c.	Right click again on the project’s name. Click on “Clean and Build”. You should be good to go!

== 3. Rare case: the check for updates fails
//ST: 3. Rare case: the check for updates fails
//ST: !

It sometimes happens that the address that NetBeans checks for plugin updates is incorrect.

In this case, NetBeans will never find updates and you’ll be stuck with an old version of the plugin!

Here is how to make sure you have everything correctly setup (explanations follow the picture below)

//ST: !
image::Putting-the-correct-web-address.png[align="center",title="Putting the correct web address"]
{nbsp} +

//ST: !
- In the NetBeans menu, click on Tools -> Plugin
- In the window that opens, click on tab “Settings” (last tab on the right)
** Select the line “CodenameOnePlugin Update Center”, it should be highlighted
** Verify that the url (web address) on the right is:
`https://www.codenameone.com/files/netbeans/updates.xml`

//ST: !
** If it’s not, then click on “edit” and put this address above instead.
** By default, updates are checked every week. Change this for “every startup”.

//ST: !
That’s it! You have to do it just once, next time NetBeans will now how to search plugin updates by itself!

Just check if there is a bubble at the bottom right corner when you open NetBeans.


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
