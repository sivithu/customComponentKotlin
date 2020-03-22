# customComponentKotlin

<img width="475" alt="Capture d’écran 2020-03-22 à 09 43 15" src="https://user-images.githubusercontent.com/36171154/77245801-ab302080-6c21-11ea-8303-c9d8f6515936.png">

Le but du TP est de créer un custom component qui contiendra 2 choses :
* une imageView avec des dimensions fixes
* un editText

L'image doit s'afficher à gauche de la zone d'édition de texte.
Je dois pouvoir paramétrer avec des attributs custom :
* la source de l'image
* la couleur du texte
* le texte de l’EditText, via directement une string ou une resource 

Le projet final doit contenir un activity avec votre custom component dans son layout.

```android
<com.maruani.esgi.summaryapplication.module.customview.CustomComponent
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:src="@android:drawable/star_off"
        app:text="toto"
        app:textColor="@color/colorPrimary" />

<com.maruani.esgi.summaryapplication.module.customview.CustomComponent
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:src="@android:drawable/star_off"
            app:text="@string/app_name"
            app:textColor="@color/colorPrimary" />
 ```
 
