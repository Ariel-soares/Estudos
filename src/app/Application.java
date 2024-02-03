package app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

public class Application {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		OnlinePaymentService ops = new PaypalService();

		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double valor = sc.nextDouble();
		
		Contract contract = new Contract(numero, data, valor);

		System.out.println("Entre com o número de parcelas: ");
		Integer parcelas = sc.nextInt();
		
		ContractService service = new ContractService(ops);
		
		service.processContract(contract, parcelas);
		
		
		for(Installment i : contract.getInstallments()) {
			System.out.println(i.toString());;
		}
		sc.close();
	}

}
