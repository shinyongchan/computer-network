import java.util.Scanner;

class Poke {
    protected int count = 0;
    protected String owner = null;
    protected String [] skills = null;
    public Poke (String owner, String skills){
        this.owner = owner;
        this.skills = skills.split("/");
        System.out.print("포켓몬 생성 : ");
        this.count = this.count + 1;
    }
    public void info(){
        System.out.printf("%s의 포켓몬이 사용가능한 스킬\n", this.owner);
        for (int i = 0; i < this.skills.length; i++){
            System.out.printf("%d : %s\n", i+1, this.skills[i]);
        }
    }
    public void attack(int idx){
        System.out.printf("%s 공격 시전!", this.skills[idx-1]);
    }



}

class Pikachu extends Poke{
    protected String name = null;
    public Pikachu (String owner, String skills){
        super(owner, skills);
        this.name = "피카츄";
        System.out.printf("%s\n", this.name);
    }

    @Override
    public void attack(int idx) {
        System.out.printf("[삐까삐까] %s의 %s가 %s 공격 시전!\n", this.owner, this.name, this.skills[idx-1]);
    }
}

class Pairi extends Poke{
    protected String name = null;
    public Pairi (String owner, String skills){
        super(owner, skills);
        this.name = "파이리";
        System.out.printf("%s\n", this.name);
    }

    @Override
    public void attack(int idx) {
        System.out.printf("[파읠파읠] %s의 %s가 %s 공격 시전!\n", this.owner, this.name, this.skills[idx-1]);
    }
}

class Ggoboogi extends Poke{
    protected String name = null;
    public Ggoboogi (String owner, String skills){
        super(owner, skills);
        this.name = "꼬부기";
        System.out.printf("%s\n", this.name);
    }

    @Override
    public void attack(int idx) {
        System.out.printf("[꼬북꼬북] %s의 %s가 %s 공격 시전!\n", this.owner, this.name, this.skills[idx-1]);
    }
    public void swim(){
        System.out.printf("%s가 수영을 합니다", this.name);
    }
}
public class pokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.printf("총 %d마리의 포켓몬이 생성되었습니다\n", count);
            System.out.print("1) 포켓몬 생성 2) 프로그램 종료 : ");
            int menu = sc.nextInt();

            if (menu == 2){
                System.out.print("프로그램을 종료합니다");
                break;
            }
            else if (menu == 1){
                count = count + 1;
                System.out.print("1)피카츄 2)꼬부기 3)파이리 : ");
                int monster = sc.nextInt();
                System.out.print("플레이어 이름 입력 : ");
                String n = sc.next();

                System.out.print("사용 가능한 기술 입력 (/로 구분하여 입력) : ");
                String s = sc.next();
                if (monster == 1) {
                    Pikachu p = new Pikachu(n, s);
                    p.info();
                    System.out.print("공격 번호 선택 : ");
                    int atkMenu = sc.nextInt();
                    p.attack(atkMenu);
                }
                else if (monster == 2){
                    Ggoboogi p = new Ggoboogi(n, s);
                    p.info();
                    System.out.print("공격 번호 선택 : ");
                    int atkMenu = sc.nextInt();
                    p.attack(atkMenu);
                }
                else if (monster == 3) {
                    Pairi p = new Pairi(n, s);
                    p.info();
                    System.out.print("공격 번호 선택 : ");
                    int atkMenu = sc.nextInt();
                    p.attack(atkMenu);
                }
                else
                    System.out.println("메뉴에서 골라 주세요");


            }
            else
                System.out.println("메뉴에서 골라 주세요");
        }


    }
}
