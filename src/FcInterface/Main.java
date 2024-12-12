package FcInterface;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Consumer interfeysi heç bir nəticə qaytarmadan tək bir giriş arqumentini qəbul edən
        // və onun üzərində bəzi hərəkətləri yerinə yetirən əməliyyatı təmsil edir.
        // Consumer interfeysinin ümumi istifadə hallarına çap, giriş və yeniləmə vəziyyəti daxildir.
        // Consumer-de accept metodu ile deyer oturulur .


//        Predicate interfeysi bir giriş qəbul edən və müəyyən bir şərtə əsaslanaraq
//        boolean dəyəri qaytaran mantiqi dəyərli funksiyanı təmsil edir.
//        Predcate-ler obyektlərin süzülməsi və şərti olaraq işləməsi üçün güclü vasitədir.
//        Predcate-ler daha təkmil şərtlər yaratmaq üçün AND, OR və NOT kimi
//        məntiqi operatorlardan istifadə etməklə birləşdirilə bilər.
//        Məlumatların filtrasiyası, doğrulama və şərti emal kimi tapşırıqlar üçün faydalıdır.
//        Predicate-de deyer test methodu ile oturul.



        FakeConsumer<Integer> test= System.out::println;
        test.add(1);


        FakeFunction<Integer,Double> test2= (a)->a/2.0;
        System.out.println(test2.qaytar(10));


        FakePredicate<String> test3 = (a)->{
            if (a.equals("Kenan")){
                System.out.println("Giris basarili ");
            }
            else {
                System.out.println("Giris basarisiz");
            }
            return false;
        };

        test3.deyer("Kenans");


        FakeSupplier<String> test4=()->"Salam olsun Deyerli Mentorlara";
        System.out.println(test4.nese());

        FakeBiFunction<Integer ,Integer,Integer> test5 = (a, b) -> a * b;
        System.out.println(test5.biQaytar(2,3));












    }
}
