Scanner leia = new Scanner(System.in);
        
        System.out.println("Infomer a altura: ");
        double altura = leia.nextDouble();
        
        System.out.println("Informe o peso: ");
        double peso = leia.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.println("Imc: "+imc);
        
        if (imc < 18.5){
            System.out.println("Abaixo do peso!");
        } else if(imc >= 18.5 & imc <= 24.9){
            System.out.println("Peso Normal!");
        } else if(imc >= 25 & imc <= 29.9){
            System.out.println("Sobrepeso!");
        } else if(imc >= 30 & imc <= 34.9){
            System.out.println("Obesidade Grau 1!");
        } else if(imc >= 35 & imc <= 39.9){
            System.out.println("Obesidade Grau 2!");
        } else {
            System.out.println("Obesidade Grau 3!");
        }
