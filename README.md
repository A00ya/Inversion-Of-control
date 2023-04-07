<h2>Principe de l’Inversion de Contrôle et
Injection des dépendances</h2>

<h3>L’Inversion de contrôle :</h3>
<p>• Permettre au développeur de s’occuper uniquement du code métier (Exigences
fonctionnelles) et c’est le Framework qui s’occupe du code technique (Exigences Techniques)</p>

<h3>l'interface daoInterface avec une méthode getDate</h3>
<img src="Screenshots/Screenshot 2023-04-07 111003.png" alt="">

<h3>Une implémentation de cette interface (daoImplementation)</h3>
<img src="Screenshots/Screenshot 2023-04-07 111017.png" alt="">

<h3>l'interface metierInterface avec une méthode calcul</h3>
<img src="Screenshots/Screenshot 2023-04-07 111022.png" alt="">

<h3>Une implémentation de cette interface en utilisant le couplage faible (metierImplementation)</h3>
<img src="Screenshots/Screenshot 2023-04-07 111028.png" alt="">
