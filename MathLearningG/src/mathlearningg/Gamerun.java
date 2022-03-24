
package mathlearningg;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gamerun {
    
    Scanner input = new Scanner(System.in);
    public int score = 0,flag=0,total=0,wrong=0,correct=0;
    public int score1=0,flag2=0, total2=0,wrong2=0,correct2=0;
    String summary = "";
    public void learnSum(){
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        //System.out.println("What is "+num1+"+"+num2+"?");
        //int userAnswer = input.nextInt();
        String an = JOptionPane.showInputDialog("What is "+num1+"+"+num2+"? ");
        int userAnswer = Integer.parseInt(an);
        int actualAnswer = num1+num2;
        if(userAnswer == actualAnswer){
           // System.out.println("Right!");
            score=score+1;
            total++;
            correct++;
           JOptionPane.showMessageDialog(null,"Correct!");
        }else{
           flag=1;
           wrong++;
           total++;
          JOptionPane.showMessageDialog(null,"Wrong! Correct ans: "+actualAnswer );
          //  summary = summary+"\n"+num1+"+"+num2+"="+userAnswer+":"+false;
        } 
        //summary = summary+"\n"+num1+"+"+num2+"="+userAnswer+":"+(userAnswer == actualAnswer);
        //JOptionPane.showMessageDialog(null,"Score is : "+score+"\nCorrect Ans : "+correct+"\nWrong Ans : "+wrong+"\nTotal : "+total );
    }
      public void learnMulti(){
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
          //System.out.println("What is "+num1+"*"+num2+"?");
        //int userAnswer = input.nextInt();
        String an = JOptionPane.showInputDialog("What is "+num1+"*"+num2+"? ");
        int userAnswer = Integer.parseInt(an);
        int actualAnswer = num1*num2;
        if(userAnswer == actualAnswer){
            score++;
            total++;
            correct++;
          JOptionPane.showMessageDialog(null,"Correct!");
        }else{
           flag=1;
           wrong++;
           total++;
          JOptionPane.showMessageDialog(null,"Wrong! Correct ans: "+actualAnswer );
        }
        //summary = summary+"\n"+num1+"-"+num2+"="+userAnswer+":"+(userAnswer == actualAnswer);
        //JOptionPane.showMessageDialog(null,"Score is : "+score+"\nCorrect Ans : "+correct+"\nWrong Ans : "+wrong+"\nTotal : "+total );
    }
    public void learnSub(){
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        if(num2>num1){
           int temp = num1;
           num1 = num2;
           num2 = temp;
        }
        //System.out.println("What is "+num1+"-"+num2+"?");
        //int userAnswer = input.nextInt();
        String an = JOptionPane.showInputDialog("What is "+num1+"-"+num2+"? ");
        int userAnswer = Integer.parseInt(an);
        int actualAnswer = num1-num2;
        if(userAnswer == actualAnswer){
            score++;
            total++;
            correct++;
            JOptionPane.showMessageDialog(null,"Correct!");
        }else{
           flag=1;
           wrong++;
          JOptionPane.showMessageDialog(null,"Wrong! Correct ans: "+actualAnswer );
        } 
        //summary = summary+"\n"+num1+"-"+num2+"="+userAnswer+":"+(userAnswer == actualAnswer);
        //JOptionPane.showMessageDialog(null,"Score is : "+score+"\nCorrect Ans : "+correct+"\nWrong Ans : "+wrong+"\nTotal : "+total );
    }
    public void learnDiv(){
        double num1 = (int)(Math.random()*10);
        double num2 = (int)(Math.random()*10);
        if(num1==0)num1++;
        if(num2==0)num2++;
        if(num2>num1){
           double temp = num1;
           num1 = num2;
           num2 = temp;
        }
        //System.out.println("What is "+(int)num1+"/"+(int)num2+"?");
        //double userAnswer = input.nextDouble();
        String an = JOptionPane.showInputDialog("What is "+num1+"/"+num2+"? ");
        double userAnswer = Double.parseDouble(an);
        double actualAnswer = num1/num2;
        actualAnswer = (num1/num2)*100;
        actualAnswer = Math.round(actualAnswer)/100.0;
        if(userAnswer == actualAnswer){
            score++;
            total++;
            correct++;
          JOptionPane.showMessageDialog(null,"Correct!");
        }else{
           flag=1;
           wrong++;
           total++;
            JOptionPane.showMessageDialog(null,"Wrong! Correct ans: "+actualAnswer );
        } 
        //summary = summary+"\n"+(int)num1+"/"+(int)num2+"="+userAnswer+":"+(userAnswer == actualAnswer);
        //JOptionPane.showMessageDialog(null,"Score is : "+score+"\nCorrect Ans : "+correct+"\nWrong Ans : "+wrong+"\nTotal : "+total );
    }
    
    
    
    
}
