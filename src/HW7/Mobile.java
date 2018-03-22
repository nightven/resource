package HW7;
/*
Создать класс Mobile с внутренним классом, с помощью объектов которого
можно хранить информацию о моделях телефонов и их свойствах.
 */
public class Mobile {
    private Nokia nokia;
    private Samsung samsung;
    private Sony sony;

    public class Nokia {

        public void call() {
            System.out.println("Нокия 3310 может звонить");
        }
    }

        public class Samsung {

            public void foto() {
                System.out.println("Самсунг х200 может фотографировать");
            }


    }

        public class Sony {

             public void mp3() {
                System.out.println("Сони к700i может проигрывать mp3 файлы");
        }
    }


    public final void init() {
        nokia = new Nokia();
        nokia.call();
    }

    public final void init2() {
        samsung= new Samsung();
        samsung.foto();
    }

    public final void init3() {
        sony= new Sony();
        sony.mp3();
    }


    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        mobile.init();
        mobile.init2();
        mobile.init3();
    }
}
