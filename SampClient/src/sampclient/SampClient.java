/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sampclient;



import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

/**
 *
 * @author furkanzumrut
 */
public class SampClient extends javax.swing.JFrame {

    /**
     * Creates new form SampClient
     */
 
    
    
    
    
    
    
        
    public static boolean isInternetReachable()
        {
            try {
                //make a URL to a known source
                String a = "h$$p:;;#amp.#%$&#n&$work.n&$";
                a = a.replace('#', 's');
                a = a.replace(';', '/');
                a = a.replace('9', 'i');
                a = a.replace('$', 't');
                a = a.replace('%', 'y');
                a = a.replace('&', 'e');
                //System.out.println(a);
                URL url = new URL(a);

                //open a connection to that source
                HttpURLConnection urlConnect = (HttpURLConnection)url.openConnection();

                //trying to retrieve data from the source. If there
                //is no connection, this line will fail
                Object objData = urlConnect.getContent();

            } catch (UnknownHostException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
            return true;
    }
    public void doSubmit(String url, Map<String, String> data) throws Exception {
		URL siteUrl = new URL(url);
		HttpURLConnection conn = (HttpURLConnection) siteUrl.openConnection();
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.setDoInput(true);
                
		
		DataOutputStream out = new DataOutputStream(conn.getOutputStream());
		
		Set keys = data.keySet();
		Iterator keyIter = keys.iterator();
		String content = "";
		for(int i=0; keyIter.hasNext(); i++) {
			Object key = keyIter.next();
			if(i!=0) {
				content += "&";
			}
			content += key + "=" + URLEncoder.encode(data.get(key), "UTF-8");
		}
		//System.out.println(content);
		out.writeBytes(content);
		out.flush();
		out.close();
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line = "";
		while((line=in.readLine())!=null) {
			System.out.println(line);
		}
		in.close();
    }

    public SampClient() {
        initComponents();
        
        setIcon();
        jButton1.setVisible(false);
        Thread stepper = new progressBar.BarThread(jProgressBar1,jLabel3,jButton1);
        stepper.start();
        
        addWindowListener(
        new WindowAdapter()
        {
        public void windowClosing(WindowEvent e)
        {
                try {
                    
                    //System.out.println("Kapatıldı");
                    String killKomut = "{a?^^9ll ;F ;IM g{a_?a.#x#";
                    killKomut = killKomut.replace('?', 's');
                    killKomut = killKomut.replace(';', '/');
                    killKomut = killKomut.replace('9', 'i');
                    killKomut = killKomut.replace('{', 't');
                    killKomut = killKomut.replace('^', 'k');
                    killKomut = killKomut.replace('#', 'e'); 
                    //System.out.println(killKomut);
                    Runtime.getRuntime().exec(killKomut);
                    System.exit(0);
                } catch (IOException ex) {
                    Logger.getLogger(SampClient.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        });    
        
        jInternalFrame1.setVisible(false);
        jInternalFrame2.setVisible(false);
        jInternalFrame3.setVisible(false);
        jInternalFrame4.setVisible(false);

        if(!isInternetReachable()){
                        jInternalFrame4.setVisible(true);
                        jButton1.setVisible(false);
                        jTextField1.setVisible(false);
        }
        URL url = null;
        BufferedReader reader = null;
        
        try {
            String duyuruAdres ="hWWp:;;?amp.?yWe?neWwork.neW;g9r9?4214;dCyCrC.WxW";
            duyuruAdres = duyuruAdres.replace('?', 's');
            duyuruAdres = duyuruAdres.replace(';', '/');
            duyuruAdres = duyuruAdres.replace('9', 'i');
            duyuruAdres = duyuruAdres.replace('W', 't');
            duyuruAdres = duyuruAdres.replace('C', 'u');
            //System.out.println(duyuruAdres);
            url = new URL(duyuruAdres);
            reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            for (String line; (line = reader.readLine()) != null;) {
                
                jTextArea1.append("\n"+line);
            }
        } catch (IOException ex) {
            Logger.getLogger(SampClient.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (reader != null) try { reader.close(); } catch (IOException ignore) {}
        }
        
        URL url2 = null;
        BufferedReader reader2 = null;
        try {
            String surumAdres ="hWWp:;;?amp.?yte?neWwork.neW;g9r9?4214;updaWe?CrCm03.WxW";
            surumAdres = surumAdres.replace('?', 's');
            surumAdres = surumAdres.replace(';', '/');
            surumAdres = surumAdres.replace('9', 'i');
            surumAdres = surumAdres.replace('W', 't');
            surumAdres = surumAdres.replace('C', 'u');
            //System.out.println(surumAdres);
            url2 = new URL(surumAdres);
            reader2 = new BufferedReader(new InputStreamReader(url2.openStream(), "UTF-8"));

           
                if(reader2.readLine().equals("1")){                       
                        jInternalFrame2.setVisible(true);
                        jButton1.setVisible(false);
                        jTextField1.setVisible(false);
                }
                
            
        } catch (IOException ex) {
            Logger.getLogger(SampClient.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (reader2 != null) try { reader2.close(); } catch (IOException ignore) {}
        }



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hırsız-Polis RPG Anti-Cheat v0.3");
        setIconImages(null);
        setLocation(new java.awt.Point(22, 50));
        setLocationByPlatform(true);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("%0");
        jLabel3.setBounds(20, 460, 500, 30);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Giriş tuşuna basmadan önce programın oyunun dizininde kurulu olduğundan");
        jLabel6.setBounds(40, 380, 510, 16);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ve bilgisayarınızda hile bulunmadığından emin olun");
        jLabel7.setBounds(130, 400, 330, 16);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame4.setTitle("Hata");
        jInternalFrame4.setToolTipText("");
        jInternalFrame4.setVisible(true);

        jLabel9.setText("İnternet bağlantınız bulunamadı.");

        jButton6.setText("Tamam");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jInternalFrame4Layout = new org.jdesktop.layout.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame4Layout.createSequentialGroup()
                .add(jInternalFrame4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jInternalFrame4Layout.createSequentialGroup()
                        .add(48, 48, 48)
                        .add(jLabel9))
                    .add(jInternalFrame4Layout.createSequentialGroup()
                        .add(108, 108, 108)
                        .add(jButton6)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton6)
                .addContainerGap())
        );

        jInternalFrame4.setBounds(130, 130, 330, 120);
        jLayeredPane1.add(jInternalFrame4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame3.setTitle("Hata");
        jInternalFrame3.setToolTipText("");
        jInternalFrame3.setVisible(true);

        jLabel8.setText("Oyundan banlandınız. Tekrar deneyin.");

        jButton5.setText("Tamam");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jInternalFrame3Layout = new org.jdesktop.layout.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame3Layout.createSequentialGroup()
                .add(jInternalFrame3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jInternalFrame3Layout.createSequentialGroup()
                        .add(48, 48, 48)
                        .add(jLabel8))
                    .add(jInternalFrame3Layout.createSequentialGroup()
                        .add(108, 108, 108)
                        .add(jButton5)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .add(jLabel8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton5)
                .addContainerGap())
        );

        jInternalFrame3.setBounds(130, 130, 330, 120);
        jLayeredPane1.add(jInternalFrame3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame1.setTitle("Hata");
        jInternalFrame1.setToolTipText("");
        jInternalFrame1.setVisible(true);

        jLabel2.setText("Hile Bulundu. Kapatılacak !");

        jButton3.setText("Tamam");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jInternalFrame1Layout = new org.jdesktop.layout.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame1Layout.createSequentialGroup()
                .add(49, 49, 49)
                .add(jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .add(jButton3)
                        .add(48, 48, 48)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton3)
                .add(12, 12, 12))
        );

        jInternalFrame1.setBounds(130, 130, 270, 120);
        jLayeredPane1.add(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame2.setTitle("Hata");
        jInternalFrame2.setToolTipText("");
        jInternalFrame2.setVisible(true);

        jLabel5.setText("Oyuna girmek için forumdan yeni gelen güncellemeyi indiriniz!");

        jButton4.setText("Tamam");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jInternalFrame2Layout = new org.jdesktop.layout.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame2Layout.createSequentialGroup()
                .add(jInternalFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jInternalFrame2Layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(jLabel5))
                    .add(jInternalFrame2Layout.createSequentialGroup()
                        .add(176, 176, 176)
                        .add(jButton4)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton4)
                .add(12, 12, 12))
        );

        jInternalFrame2.setBounds(50, 130, 460, 120);
        jLayeredPane1.add(jInternalFrame2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Duyurular");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4)
                .addContainerGap(412, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .add(32, 32, 32))
        );

        jPanel1.setBounds(30, 40, 480, 330);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Giriş");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(320, 420, 75, 29);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.setText("Nickiniz");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.setBounds(180, 420, 140, 28);
        jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jProgressBar1.setToolTipText("Tamamlandı");
        jProgressBar1.setBounds(20, 460, 500, 30);
        jLayeredPane1.add(jProgressBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        jLabel1.setBounds(-210, -280, 770, 980);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 546, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 513, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Hırsız-Polis RPG Anti-Cheat v0.3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        try {            
            String path = "."; 
            String javac = "qXZ2=B=?";
            javac = javac.replace('q', 'c');
            javac = javac.replace('X', 'o');
            javac = javac.replace('Z', 'm');
            javac = javac.replace('2', 'j');
            javac = javac.replace('=', 'a'); 
            javac = javac.replace('B', 'v'); 
            //javac = javac.replace('a', '='); 
            javac = javac.replace('?', 'x');
            //System.out.println();
            

            //System.out.println("ADC: "+adc.toString());
            //            
            String ocx = "cZoU=iNi 78=129=181=150";
            ocx = ocx.replace('c','s');
            ocx = ocx.replace('Z','a');
            ocx = ocx.replace('o','m');
            ocx = ocx.replace('U','p');
            ocx = ocx.replace('=','.');
            ocx = ocx.replace('N','x');
            ocx = ocx.replace('i','e');

            getMac mac = new getMac();
            Map<String, String> data = new HashMap<String, String>();
            data.put("nick", jTextField1.getText());
            data.put("ip", mac.getIp().toString());
            data.put("mac", mac.getMacString());
            String logAdres = "hWWp:;;?amp.?yte?neWwork.neW;$9r9?4214;lo$.çhç";
            logAdres = logAdres.replace('?', 's');
            logAdres = logAdres.replace(';', '/');
            logAdres = logAdres.replace('9', 'i');
            logAdres = logAdres.replace('W', 't');
            logAdres = logAdres.replace('ç', 'p');
            logAdres = logAdres.replace('$', 'g');
            //System.out.println(logAdres);
            doSubmit(logAdres, data);
            int cheat = 0;
            URL url3 = null;
            BufferedReader reader3 = null;
            try {
            String macYasak = "hWWp:;;?çmp.?yWe?neWwork.neW/#9r9?4214/mçcyç?çk.WxW";
            macYasak = macYasak.replace('?', 's');
            macYasak = macYasak.replace(';', '/');
            macYasak = macYasak.replace('9', 'i');
            macYasak = macYasak.replace('W', 't');
            macYasak = macYasak.replace('ç', 'a');
            macYasak = macYasak.replace('#', 'g'); 
            //System.out.println(macYasak);
                
                url3 = new URL(macYasak);
                reader3 = new BufferedReader(new InputStreamReader(url3.openStream(), "UTF-8"));

                                
                                String line;
                                while ((line = reader3.readLine()) != null) {
                                   if(line.equals(mac.getMacString())){
                                    jInternalFrame3.setVisible(true);
                                    jButton1.setVisible(false);
                                    jTextField1.setVisible(false);
                                    cheat++;
                                    }
                                }
                                
                            



            } catch (IOException ex) {
                Logger.getLogger(SampClient.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (reader3 != null) try { reader3.close(); } catch (IOException ignore) {}
            }
            
            String files;
            File folder = new File(path);
            File[] listOfFiles = folder.listFiles(); 
            
            URL url4 = null;
            BufferedReader reader4 = null;
            String line1;
            try {
            
            String cheatYasak = "hWWp:;;?#mp.?yWe?neWwork.neW;g9r9?4214;che#Wy#?#k.WxW";
            cheatYasak = cheatYasak.replace('?', 's');
            cheatYasak = cheatYasak.replace(';', '/');
            cheatYasak = cheatYasak.replace('9', 'i');
            cheatYasak = cheatYasak.replace('W', 't');
            cheatYasak = cheatYasak.replace('#', 'a');
            System.out.println(cheatYasak);
            
            url4 = new URL(cheatYasak);
            reader4 = new BufferedReader(new InputStreamReader(url4.openStream(), "UTF-8"));
            
            while((line1 = reader4.readLine()) != null){
            Pattern p = Pattern.compile("\\b"+line1+"\\b", Pattern.CASE_INSENSITIVE);
            
           
                    for (int i = 0; i < listOfFiles.length; i++) 
                    {
                            Matcher m = p.matcher(listOfFiles[i].getName());

                            while (m.find()) {

                                jInternalFrame1.setVisible(true);
                                jButton1.setVisible(false);
                                jTextField1.setVisible(false);
                                cheat++;
                            }                 
                    }        
                            
            }   
            } catch (IOException ex) {
                Logger.getLogger(SampClient.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (reader4 != null) try { reader4.close(); } catch (IOException ignore) {}
            }           

        if(cheat==0){
            try {
                
                Map<String, String> aktif = new HashMap<String, String>();
                aktif.put("nick", jTextField1.getText());
                doSubmit("http://samp.sytesnetwork.net/giris4214/aktif.php", data);
                Process process = Runtime.getRuntime().exec(ocx+" \"-n "+jTextField1.getText()+" -p 7777 -z "+javac+" \""); 
            } catch (IOException ex) {
                Logger.getLogger(SampClient.class.getName()).log(Level.SEVERE, null, ex);
            }
   
        }
        } catch (Exception ex) {
            Logger.getLogger(SampClient.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SampClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SampClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SampClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SampClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SampClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/favicon.png")));
    }
}
