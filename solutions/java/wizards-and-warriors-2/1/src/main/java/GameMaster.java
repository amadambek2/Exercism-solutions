public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character){
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination){
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod){
        switch (travelMethod){
            case WALKING: 
                return "You're traveling to your destination by walking.";
            default:
                return "You're traveling to your destination on horseback.";
        }
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character,Destination destination, TravelMethod travelMethod){
        String travel="";
        switch(travelMethod){
            case WALKING:
                travel="by walking";
                break;
            case HORSEBACK:
                travel="on horseback";
                break;
        }
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points. You're traveling to your destination " + travel + ". You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character,Destination destination){
        return describe(character) + " " + 
            describe(TravelMethod.WALKING) + " " +
            describe(destination);
    }
}
