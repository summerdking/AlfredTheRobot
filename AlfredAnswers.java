import java.util.Date;

public class AlfredAnswers {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello %s!", name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is " + date + ".";
    }
    
    public String respondBeforeAlexis(String conversation) {
        String convo = conversation;
        if (convo.indexOf("Alexis") > -1) {
            return "No bother Alexis, I can handle it.";
        }
        if (convo.indexOf("Alfred") > -1) {
            return "How can I assist you today?";
        }
        return "I'm always listening.";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Have a wonderful %s %s!", dayPeriod, name);
    }

    public String emotionGreeting(Boolean arg) {
        String happy = "Yes, I am very happy!";
        String angry = "No! I'm in a mood, a moody mood that makes me moody!";
        if (arg == true) {
            return happy.toLowerCase();
        }
        else {
            return angry.toUpperCase();
        }
    }

}

