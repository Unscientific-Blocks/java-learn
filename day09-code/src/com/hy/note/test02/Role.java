package com.hy.note.test02;

import java.util.Random;

public class Role {
    private String roleName;
    private int blood;
    private char gender;
    private String face;


    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    String[] injured_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String roleName, int blood, char gender) {
        this.roleName = roleName;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int n = r.nextInt(boyfaces.length);
            this.face = boyfaces[n];
        } else if (gender == '女') {
            int n = r.nextInt(girlfaces.length);
            this.face = girlfaces[n];
        } else {
            this.face = "惨不人犊";
        }
    }

    public void attack(Role role) {


        Random random = new Random();
        int kongfu = random.nextInt(attacks_desc.length);
        System.out.printf(attacks_desc[kongfu], this.getRoleName(), role.getRoleName());

        int hurt = random.nextInt(20) + 1;
        int lastBlood = role.getBlood() - hurt;
        role.setBlood(lastBlood);
        role.setBlood(role.getBlood() < 0 ? 0 : role.getBlood());

        if (lastBlood > 90) {
            System.out.printf(injured_desc[0], role.getRoleName());
        } else if (lastBlood > 80 && lastBlood <= 90) {
            System.out.printf(injured_desc[1], role.getRoleName());
        } else if (lastBlood > 70 && lastBlood <= 80) {
            System.out.printf(injured_desc[2], role.getRoleName());
        } else if (lastBlood > 60 && lastBlood <= 70) {
            System.out.printf(injured_desc[3], role.getRoleName());
        } else if (lastBlood > 40 && lastBlood <= 60) {
            System.out.printf(injured_desc[4], role.getRoleName());
        } else if (lastBlood > 20 && lastBlood <= 40) {
            System.out.printf(injured_desc[5], role.getRoleName());
        } else if (lastBlood > 10 && lastBlood <= 20) {
            System.out.printf(injured_desc[6], role.getRoleName());
        } else if (lastBlood < 10) {
            System.out.printf(injured_desc[7], role.getRoleName());
        }
        System.out.println();
    }

    public void getRoleInfo() {
        System.out.println("姓名为:" + getRoleName());
        System.out.println("血量为:" + getBlood());
        System.out.println("性别为:" + getGender());
        System.out.println("长相为:" + getFace());

    }
}
