package neetcode.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class Twitter {
	
	Map<Integer,List<Integer>> tweets; 
	Map<Integer,List<Integer>> followers;
	
	public Twitter() {
		tweets = new HashMap<>();
		followers = new HashMap<>();
	}

	public void postTweet(int userId, int tweetId) {

		if (Objects.isNull(tweets.get(userId)))
			tweets.put(userId, new ArrayList<Integer>());

		tweets.get(userId).add(tweetId);

	}

	public List<Integer> getNewsFeed(int userId) {
		List<Integer> newsFeeds = new ArrayList<>();
		List<Integer> users  = new ArrayList<>();
		users.add(userId);
		List<Integer> followersList = followers.get(userId);
		
		if(Objects.nonNull(followersList))
			users.addAll(followersList);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b-a);
		
		for (int uid : users) {
			for (int tid : tweets.get(uid)) {
				pq.add(tid);
			}
		}
		
		while(!pq.isEmpty()) {
			newsFeeds.add(pq.poll());
		}
		
		return newsFeeds;
	}

	public void follow(int followerId, int followeeId) {
		if(Objects.isNull(followers.get(followerId)))
			followers.put(followerId, new ArrayList<Integer>());
		
		followers.get(followerId).add(followeeId);
	}

	public void unfollow(int followerId, int followeeId) {
		if(Objects.nonNull(followers.get(followerId)))
			followers.get(followerId).remove(Integer.valueOf(followeeId));
	}
	
	public static void main(String[] args) {
		Twitter twitter = new Twitter();
		twitter.postTweet(1, 5);
		twitter.postTweet(1, 3);
		System.out.println(twitter.getNewsFeed(1));
	}
}
