// 주제 : Abstract Factory 적용 후

package designpattern.abstractfactory.exam02;

import java.util.Scanner;

public class Game {
  Scanner keyScan = new Scanner(System.in);
  int selectedRace;
  HomeFactory factory;
  Home home;
  
  public void service() throws Exception {
    selectRace();
    
    String command = null;
    do {
      System.out.print("명령> ");
      command = keyScan.nextLine();
      if (command.equals("home")) {
        doHome();
      } else {
        System.out.println("유효하지 않은 명령어입니다.");
      }
    } while (!command.equals("quit"));
    System.out.println("게임 종료");
  }
  
  private void doHome() {
    home = factory.createHome();

    System.out.println("집짓기 완료!");
    System.out.print("집정보 --> ");
    System.out.println(home);
  }

  private void selectRace() {
    System.out.println("1)인간족 2)외계족 3)괴물족");
    System.out.print("종족을 선택하시오? ");
    selectedRace = Integer.parseInt(keyScan.nextLine());
    
    if (selectedRace == 1) {
      factory = new HumanHomeFactory();      
    } else if (selectedRace ==2) {
      factory = new AlienHomeFactory();
    } else {
      factory = new MonsterHomeFactory();
    }
  }
  
  public static void main(String[] args) throws Exception {
    Game game = new Game();
    game.service();
  }

}
