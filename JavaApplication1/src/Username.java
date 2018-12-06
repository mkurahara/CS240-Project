/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brody
 */
public class Username {
    public static String user;
    public static int benchMax;
    public static int squatMax;
    public static int liftingExp;
    public static int focusArea;
    public static String password;
    public static int hangMax;
    public static int initHang;
    public static int initSquat;
    public static int initBench;
 public static void setInitBench (int s)
{
 initBench=s;
}
 public static void setInitSquat (int s)
{
initSquat=s;
}
public static void setInitClean (int s)
{
initHang=s;
}
public static void setHang (int s)
{
hangMax=s;
}
public static void setPassword (String s)
{
password= s;
}
    
    
public static void setBench (int s)
{
benchMax=s;
}
public static void setSquat(int s)
{
squatMax=s;
} 
public static void setExp(int s)
{
liftingExp=s;
}public static void setFocus(int s)
{
focusArea=s;
}
    
public static void setUserName(String s)
{
user=s;
}

}
