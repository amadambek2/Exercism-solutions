import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> collection = new HashSet<>(cards);
        return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
       boolean iHaveExtra = !myCollection.stream()
           .filter(card -> !theirCollection.contains(card))
           .toList().isEmpty();
        boolean friendHasExtra = !theirCollection.stream()
            .filter(card -> !myCollection.contains(card))
            .toList().isEmpty();
        return iHaveExtra && friendHasExtra;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.get(0));
        for(Set<String> collection:collections){
            common.retainAll(collection);
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
        for(Set<String> collection:collections){
            all.addAll(collection);
        }
        return all;
    }
}
