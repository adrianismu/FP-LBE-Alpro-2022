# FP LBE Alpro 2022

- Fork repositori ini
- Ubah isi repository ini sehingga dapat diperlihatkan konsep:
  - *inheritance*
  - enkapsulasi
  - abstraksi
  - *polymorphism*
- Perlihatkan implementasi konsep diatas pada README ini.
- Gunakan nama *class* yang sudah ada sebagai tema dari project ini.

Catatan: Program tidak harus dapat dijalankan, cukup ditunjukkan implementasi konsepnya saja.


# Inheritance

```java
public class Telephone extends Telecommunication {

  ....

}

public class VOIP extends Telecommunication {

  ....

}

public class MobilePhone extends Telephone {

  ....

}
```

# Encapsulation
```java
public class MobilePhone extends Telephone {

    private String modelName;

  ....

}
```

# Abstraction

```java
public abstract class Telecommunication {

  ....

}
```

# Polymorphism

```java
class Test {
  public static void main(String[] args) {

    Telecommunication[] test = new Telecommunication[4];
    test[0] = new MobilePhone("+62-817-555-523", "+62-858-555-624", "iPhone 13 Pro Max");
    test[1] = new Telephone("479-208-1992", "479-215-3931");
    test[2] = new VOIP("410-331-9081", "561-364-6107", true);
    test[3] = new VOIP("919-239-4504", "760-398-8588", false);

  ....

}
```