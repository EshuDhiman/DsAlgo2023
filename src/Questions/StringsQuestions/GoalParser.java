package Questions.StringsQuestions;
public class GoalParser {
    public static void main(String[] args) {
        interpret("G()(al)");
        
    }
    public static String interpret(String command) {
        
        if(command.contains("()")||command.contains("(al)")){
         command =   command.replace("()", "o");
         command =command.replace("(al)", "al");

        }
       
        return command;
    }

    
}
