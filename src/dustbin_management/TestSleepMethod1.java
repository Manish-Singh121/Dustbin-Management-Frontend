/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dustbin_management;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Manish
 */

class TestSleepMethod1 extends Thread {
    private String sent;
    private String body;
    private String subject;
    private int dustbin_id;

    public TestSleepMethod1(String sent, String body, String subject, int dustbin_id) {
        this.subject = subject;
        this.body = body;
        this.sent = sent;
        this.dustbin_id = dustbin_id;
    }

    public void run() {
        try {
            Thread.sleep(dustbin_management.Dustbin_Management.cleanerDelay);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 0; i < dustbin_management.Dustbin_Management.dustbinlist.size(); i++) {
            int id = dustbin_management.Dustbin_Management.dustbinlist.get(i).id;
            if (id == dustbin_id) {
                int level = dustbin_management.Dustbin_Management.dustbinlist.get(i).level;
                if (level != 0) {
                    Mail t1 = new Mail();
                    t1.sendMail(this.sent, this.body, this.subject);
                    Date date = Calendar.getInstance().getTime();
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                    String strDate = dateFormat.format(date);
                    dustbin_management.Dustbin_Management.logreport.add("Mail sent to authority as dustbin "
                            + dustbin_id + " is not clean till Timestamp=" + strDate);
                }
            }
        }
    }
}