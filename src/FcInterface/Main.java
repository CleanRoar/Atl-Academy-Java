package FcInterface;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Consumer interfeysi heç bir nəticə qaytarmadan tək bir giriş arqumentini qəbul edən
        // və onun üzərində bəzi hərəkətləri yerinə yetirən əməliyyatı təmsil edir.
        // Consumer interfeysinin ümumi istifadə hallarına çap, giriş və yeniləmə vəziyyəti daxildir.
        // Consumer-de accept metodu ile deyer oturulur .

        Consumer<String> test =(str)->{
            System.out.println(str.toLowerCase());
        };

        test.accept("KENAN");



//        Predicate interfeysi bir giriş qəbul edən və müəyyən bir şərtə əsaslanaraq
//        boolean dəyəri qaytaran mantiqi dəyərli funksiyanı təmsil edir.
//        Predcate-ler obyektlərin süzülməsi və şərti olaraq işləməsi üçün güclü vasitədir.
//        Predcate-ler daha təkmil şərtlər yaratmaq üçün AND, OR və NOT kimi
//        məntiqi operatorlardan istifadə etməklə birləşdirilə bilər.
//        Məlumatların filtrasiyası, doğrulama və şərti emal kimi tapşırıqlar üçün faydalıdır.
//        Predicate-de deyer test methodu ile oturul.

        Predicate<String> test2 =(a)->{
            if (a.equals("Kenan")){
                System.out.println("Giris basarili");
            }
            else {
                System.out.println("Giris basarisiz");
            }
            return false;
        };
        test2.test("Veli");


        BiFunction<Integer,Integer,Integer> test3 = (a,b)->a+b;
        System.out.println(test3.apply(2,3));

        Supplier<String> test4 =()->"Kenan";
        System.out.println(test4.get());



    }
}
