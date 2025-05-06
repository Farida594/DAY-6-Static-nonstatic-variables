public class Config{
public static String configName="System Config";
String settingValue;
public static void main(String[] args){
System.out.println("Config Name:" +Config.configName);
Config fig1=new Config();
Config fig2=new Config();
fig1.settingValue="Dark Mode";
fig1.settingValue="Light Mode";
System.out.println("Setting 1:" +fig1.settingValue);
System.out.println("Setting 2:" +fig2.settingValue);
}
}