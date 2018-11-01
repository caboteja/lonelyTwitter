package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() (super(LonelyTwitterActivity.class);)

    public void testAddTweet() ;
    Tweet tweet = new NormalTweet("Tweet");
    tweets.addTweet(tweet);
    assertTrue (tweets.hasTweet(tweet))

    public void testDeleteTweet() {
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet ("Tweet");
        tweets.addTweet(tweet);

        Tweet returnedTweet = tweets.getTweet(index 0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());


    }

    public void testingHasTweet () {
        assertTrue(Boolean.FALSE);
    }

}
