package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;

public class Application {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		Double valor = sc.nextDouble();
		
		Contract contract = new Contract(numero, data, valor);
		
		System.out.println(contract.getNumber() + " " + contract.getTotalValue());
		System.out.println("Entre com o número de parcelas: ");
		Integer parcelas = sc.nextInt();
		
		ContractService service = new ContractService();
		
		for(int i = 1; i <= parcelas; i++) {
			service.processContract(contract, i);
		}
		
		
		
		sc.close();
	}

}
