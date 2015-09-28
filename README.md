# TwitterProfile
This project allows you to grab any element of a Twitter user's profile, **given the user's screen name**. This code has not been modified to allow batch processing, nor has it been packaged into an executable `jar`. You'll have to do those yourself.

#### Available accessors:
`getCreatedAt()`, `getDescription()`, `getFollowersCount()`, `getFriendsCount()`, `getID()`, `getScreenName()`, `getName()`, `getLanguage()`, `getLocation()`, `getTimeZone()`, `getURL()`, `getVerified()`, `getProfileBackgroundImageURL()`, `getProfileBannerURL()`

#### Note that Twitter only requires users to enter a full name and screen name in order to register. Therefore, the only data that'll probably be useful to you are:
`getCreatedAt()`, `getFollowersCount()`, `getFriendsCount()`, `getID()`, `getScreenName()`, `getName()`, `getLanguage()`, `getTimeZone()`, `getVerified()`

Note that `getFollowersList()` does not appear. If you want to get all the followers of a user, use project [`TwitterUserTweets`](https://github.com/BryanOwens012/TwitterUserTweets), and even [`TwitterIDToName`](https://github.com/BryanOwens012/TwitterIDToName) if neccessary.
