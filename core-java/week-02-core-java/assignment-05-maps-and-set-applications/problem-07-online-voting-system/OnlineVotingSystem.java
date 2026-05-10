import java.util.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OnlineVotingSystem {
    public static void main(String[] args) {
        //Storing voters who have already voted
        Set<Integer> voterIDs = new HashSet<>();

        //Storing candidate votes
        Map<String, Integer> candidateVotes = new HashMap<>();

        castVote(101, "Alice", voterIDs, candidateVotes);
        castVote(102, "Bob", voterIDs, candidateVotes);
        castVote(103, "Alice", voterIDs, candidateVotes);
        castVote(101, "Bob", voterIDs, candidateVotes);
        castVote(104, "Bob", voterIDs, candidateVotes);
        castVote(105, "Alice", voterIDs, candidateVotes);

        //Displaying final results
        System.out.println("Final Voting Results:");
        for (Map.Entry<String, Integer> entry : candidateVotes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    //method to cast a vote
    private static void castVote(int voterId, String candidate, Set<Integer> votedUsers,
                                 Map<String, Integer> voteCount) {

        if (votedUsers.contains(voterId)) {//already voted cancel the vote
            System.out.println("Voter " + voterId + " has already voted. Vote rejected.");
            return;
        }
        votedUsers.add(voterId);
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
    }
}

