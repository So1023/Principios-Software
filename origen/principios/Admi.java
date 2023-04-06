/*
* Para cambiar este encabezado de licencia, elija Encabezados de licencia en Propiedades del proyecto.
* Para cambiar este archivo de plantilla, seleccione Herramientas | Plantillas
* y abra la plantilla en el editor.
*/
paquete  Principios ;

importar  Java . neto _ URL ;

/**
*
* @autor LENOVO
*/
 clase  pública Admin  extiende  javax . columpio _ JFrame {

    /**
     * Crea nuevo formulario Admi
     */
     administrador público () {
        componentes de inicio ();
    }

    Admi ( Principal  aThis , booleano  b ) {
        throw  new  UnsupportedOperationException ( "Todavía no es compatible" ); //Para cambiar el cuerpo de los métodos generados, seleccione Herramientas | Plantillas.
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     */
    @ SuppressWarnings ( "sin marcar" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     componentes de inicio de vacío  privado () {

        jButton1 = nuevo  javax . columpio _ Botón J ();
        jButton2 = nuevo  javax . columpio _ Botón J ();
        jButton3 = nuevo  javax . columpio _ Botón J ();
        jButton4 = nuevo  javax . columpio _ Botón J ();
        jButton5 = nuevo  javax . columpio _ Botón J ();

        setDefaultCloseOperation ( javax . swing . WindowConstants . EXIT_ON_CLOSE );

        jButton1 . setText ( "Pag.Principal" );
        jButton1 . addActionListener ( new  java . awt . event . ActionListener () {
            public  void  actionPerformed ( java . awt . event . ActionEvent  evt ) {
                jButton1ActionPerformed ( evt );
            }
        });

        jButton2 . setBackground ( nuevo  java . awt . Color ( 204 , 102 , 255 ));
        jButton2 . setText ( "Habilidades Administrativas" );
        jButton2 . addActionListener ( new  java . awt . event . ActionListener () {
            public  void  actionPerformed ( java . awt . event . ActionEvent  evt ) {
                jButton2ActionPerformed ( evt );
            }
        });

        jButton3 . setBackground ( nuevo  java . awt . Color ( 204 , 102 , 255 ));
        jButton3 . setText ( "¿Qué son las habilidades blandas y por qué son cada vez más valoradas?" );
        jButton3 . addActionListener ( new  java . awt . event . ActionListener () {
            public  void  actionPerformed ( java . awt . event . ActionEvent  evt ) {
                jButton3ActionPerformed ( evt );
            }
        });

        jButton4 . setBackground ( nuevo  java . awt . Color ( 204 , 102 , 255 ));
        jButton4 . setText ( "¿Cómo ser más eficaz en tu trabajo?" );
        jButton4 . addActionListener ( new  java . awt . event . ActionListener () {
            public  void  actionPerformed ( java . awt . event . ActionEvent  evt ) {
                jButton4ActionPerformed ( evt );
            }
        });

        jButton5 . setBackground ( nuevo  java . awt . Color ( 204 , 102 , 255 ));
        jButton5 . setText ( "Área de administración de una empresa" );
        jButton5 . addActionListener ( new  java . awt . event . ActionListener () {
            public  void  actionPerformed ( java . awt . event . ActionEvent  evt ) {
                jButton5ActionPerformed ( evt );
            }
        });

        javax . columpio _ Diseño GroupLayout  = new javax . columpio _ GroupLayout ( getContentPane ()); 
        getContentPane (). setLayout ( diseño );
        diseño _ establecerGrupoHorizontal (
            diseño _ createParallelGroup ( javax . swing . GroupLayout . Alignment . LEADING )
            . addGroup ( diseño . createSequentialGroup ()
                . addGroup ( diseño . createParallelGroup ( javax . swing . GroupLayout . Alignment . LEADING )
                    . addGroup ( diseño . createSequentialGroup ()
                        . addContainerGap ( javax . swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                        . agregarComponente ( jButton1 ))
                    . addGroup ( diseño . createSequentialGroup ()
                        . agregar espacio ( 33 , 33 , 33 )
                        . addGroup ( diseño . createParallelGroup ( javax . swing . GroupLayout . Alignment . TRAILING , false )
                            . addComponent ( jButton5 , javax . swing . GroupLayout . DEFAULT_SIZE , javax . swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                            . addComponent ( jButton3 , javax . swing . GroupLayout . Alignment . LEADING , javax . swing . GroupLayout . DEFAULT_SIZE , javax . swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                            . addComponent ( jButton4 , javax . swing . GroupLayout . Alignment . LEADING , javax . swing . GroupLayout . DEFAULT_SIZE , javax . swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                            . addComponent ( jButton2 , javax . swing . GroupLayout . DEFAULT_SIZE , javax . swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
                        . addGap ( 0 , 35 , Corto . MAX_VALUE )))
                . addContainerGap ())
        );
        diseño _ establecerGrupoVertical (
            diseño _ createParallelGroup ( javax . swing . GroupLayout . Alignment . LEADING )
            . addGroup ( diseño . createSequentialGroup ()
                . addContainerGap ()
                . agregarComponente ( jButton1 )
                . agregar espacio ( 18 , 18 , 18 )
                . agregarComponente ( jButton2 )
                . agregar espacio ( 32 , 32 , 32 )
                . agregarComponente ( jButton3 )
                . agregar espacio ( 32 , 32 , 32 )
                . agregar componente ( jButton4 )
                . agregar espacio ( 26 , 26 , 26 )
                . agregarComponente ( jButton5 )
                . addContainerGap ( 66 , Corto . MAX_VALUE ))
        );

        paquete ();
    } // </editor-fold>//GEN-END:initComponents

    privado  vacío  jButton1ActionPerformed ( java . awt . event . ActionEvent  evt ) { //GEN-FIRST:event_jButton1ActionPerformed
 Principal  PP = nuevo  Principal ();   
 pp _ setVisible ( verdadero );
 esto _ disponer ();
    } //GEN-ÚLTIMO:event_jButton1ActionPerformed

    privado  vacío  jButton2ActionPerformed ( java . awt . event . ActionEvent  evt ) { //GEN-FIRST:event_jButton2ActionPerformed
      si ( java . awt . escritorio . es compatible con escritorio ()){
           Java . awt _ Escritorio  escritorio = java . awt _ escritorio _ obtener Escritorio ();
           
           if ( escritorio . es compatible ( java . awt . Escritorio . Acción . BROWSE )){
               
           prueba {
           Java . neto _ URI  uri = nuevo  URI ( "https://youtu.be/YVgtG3WpEpA" );
          escritorio _ navegar ( uri );
           } captura ( Excepción  e ){
               
       }
      }
     }
    } //GEN-ÚLTIMO:event_jButton2ActionPerformed

    privado  vacío  jButton3ActionPerformed ( java . awt . event . ActionEvent  evt ) { //GEN-FIRST:event_jButton3ActionPerformed
     si ( java . awt . escritorio . es compatible con escritorio ()){
           Java . awt _ Escritorio  escritorio = java . awt _ escritorio _ obtener Escritorio ();
           
           if ( escritorio . es compatible ( java . awt . Escritorio . Acción . BROWSE )){
               
           prueba {
           Java . neto _ URI  uri = nuevo  URI ( "https://youtu.be/51nNGpEO6wg" );
          escritorio _ navegar ( uri );
           } captura ( Excepción  e ){
               
       }
      }
     }
    } //GEN-ÚLTIMO:event_jButton3ActionPerformed

    privado  vacío  jButton4ActionPerformed ( java . awt . event . ActionEvent  evt ) { //GEN-FIRST:event_jButton4ActionPerformed
     si ( java . awt . escritorio . es compatible con escritorio ()){
           Java . awt _ Escritorio  escritorio = java . awt _ escritorio _ obtener Escritorio ();
           
           if ( escritorio . es compatible ( java . awt . Escritorio . Acción . BROWSE )){
               
           prueba {
           Java . neto _ URI  uri = nuevo  URI ( "https://youtu.be/IZZnnTMRMgs" );
          escritorio _ navegar ( uri );
           } captura ( Excepción  e ){
               
       }
      }
     }
    } //GEN-ÚLTIMO:event_jButton4ActionPerformed

    privado  vacío  jButton5ActionPerformed ( java . awt . event . ActionEvent  evt ) { //GEN-FIRST:event_jButton5ActionPerformed
     si ( java . awt . escritorio . es compatible con escritorio ()){
           Java . awt _ Escritorio  escritorio = java . awt _ escritorio _ obtener Escritorio ();
           
           if ( escritorio . es compatible ( java . awt . Escritorio . Acción . BROWSE )){
               
           prueba {
           Java . neto _ URI  uri = nuevo  URI ( "https://youtu.be/tVAZ8tYTtgw" );
          escritorio _ navegar ( uri );
           } captura ( Excepción  e ){
               
       }
      }
     }
    } //GEN-ÚLTIMO:event_jButton5ActionPerformed

    /**
     * @param argumenta los argumentos de la línea de comando
     */
    public  static  void  principal ( String  args []) {
        /* Establezca la apariencia de Nimbus */
        //<editor-fold defaultstate="collapsed" desc=" Código de configuración de apariencia (opcional) ">
        /* Si Nimbus (introducido en Java SE 6) no está disponible, mantenga la apariencia predeterminada.
         * Para obtener más información, consulte http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        prueba {
            para ( javax . swing . UIManager . LookAndFeelInfo  info : javax . swing . UIManager . getInstalledLookAndFeels ()) {
                if ( "Nimbus" . es igual a ( info . getName ())) {
                    javax . columpio _ UIManager . setLookAndFeel ( info . getClassName ());
                    romper ;
                }
            }
        } captura ( Excepción ClassNotFoundex  ) {
            Java . útil _ registro _ registrador _ getLogger ( Admi . clase . getName ()). log ( java . util . logging . Level . SEVERE , null , ex );
        } catch ( Excepción de instanciación  ex ) {
            Java . útil _ registro _ registrador _ getLogger ( Admi . clase . getName ()). log ( java . util . logging . Level . SEVERE , null , ex );
        } captura ( Excepción IllegalAccessex  ) {
            Java . útil _ registro _ registrador _ getLogger ( Admi . clase . getName ()). log ( java . util . logging . Level . SEVERE , null , ex );
        } catch ( javax . swing . UnsupportedLookAndFeelException  ex ) {
            Java . útil _ registro _ registrador _ getLogger ( Admi . clase . getName ()). log ( java . util . logging . Level . SEVERE , null , ex );
        }
        //</editor-fold>

        /* Crear y mostrar el formulario */
        Java . awt _ Cola de eventos . invocarLater ( nuevo  ejecutable () {
             ejecución de vacío  público () {
                nuevo  administrador (). setVisible ( verdadero );
            }
        });
    }

    // Declaración de variables - no modificar//GEN-BEGIN:variables
     Java privado . columpio _ Botón jBotón  jBotón1 ;
     Java privado . columpio _ Botón J Botón  j Botón2 ;
     Java privado . columpio _ Botón JBotón  jBotón3 ;
     Java privado . columpio _ JButton  jButton4 ;
     Java privado . columpio _ Botón J Botón  j Botón5 ;
    // Fin de la declaración de variables // GEN-END: variables
}
