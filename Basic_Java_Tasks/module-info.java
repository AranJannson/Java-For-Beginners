/**
 * @author Aran Jannson
 *
 */
module Basic_Java_Tasks {
    requires junit4;
    opens task7 to junit4;
    exports task8;
    exports task8.example;
}