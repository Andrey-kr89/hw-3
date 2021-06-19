class ATM{

    public int countBanknotes(int sum){
        int kvo = 0;

        while (sum>0){
            if (sum>=500){sum = sum-500; kvo++;} else
            if (sum>=200){sum = sum-200; kvo++;} else
            if (sum>=100){sum = sum-100; kvo++;} else
            if (sum>=50){sum = sum-50; kvo++;} else
            if (sum>=20){sum = sum-20; kvo++;} else
            if (sum>=10){sum = sum-10; kvo++;} else
            if (sum>=5){sum = sum-5; kvo++;} else
            if (sum>=2){sum = sum-2; kvo++;} else
            if (sum>=1){sum = sum-1; kvo++;}

        }
        return kvo;
    }

}
