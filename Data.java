package intelect;

public enum Data {
    BANER("Банер "," 150сом/м2"),PLENCA("Самоклеющаяся Пленка "," 160сом/м2"),
    PBANER("Перфа-Банер "," 180сом/м2"),PPLENCA("Самоклеющаяся Перфа-Пленка "," 165сом/м2"),

    A4("А4-Формат"," 10сом/лист"),A3("А3-Формат"," 30сом/лист"),

    MEDIARECLAMA("Медиа Реклама","1день/3-раза/6000сом"),

    INSTA("Cоцсети","День-3раз/500сом"),

    SUVENIR1("Cувенираная реклама-одежды","400сом"),SUVENIR2("Cувенираная реклама-посуды","250сом"),

    PROMOROUTER("Промороутер","1чел/500сом"),

    TV("Tв-реклама","15-+20/месяц/10000сом"),

    TVIDEO("Tв-реклама","3-+5/1день/3000сом"),

    TRANS("Реклама на Транспорте","/месяц/год"),
    MONAT1("1месяц "," 12 000/сом"),
    MONAT3( "3месяца  ","9 000/сом" ),
    MONAT6( "6месяцев","7 400/сом" ),
    MONAT12("12месяцев"," 6 500/сом"),

    AUDI1("Информационные аудиоролики","3000/сом"),

           AUDI2 ("Игровые аудиоролики","3500/сом"),

            AUDI3("Имиджевые аудиоролики","5050/сом"),

            AUDI4("Вокальные аудиоролики","8000/сом");


    private String name;


    private String namePrice;
    Data(String name,String namePrice){
        this.name=name;
        this.namePrice=namePrice;

    }
    public String getName() {
        return name;
    }
    public String getNamePrice() {
        return namePrice;
    }

    @Override
    public String toString() {
        return name+" "+namePrice;
    }
}
