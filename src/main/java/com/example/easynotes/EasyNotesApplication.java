package com.example.easynotes;

import com.example.easynotes.model.Lec_lectura;
import okhttp3.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class EasyNotesApplication {



	String Username = "AGC80037";
	String Password = "Agc2019*";
	private static final String URL_LOGIN = "http://webapp17.sedapal.com.pe:8080/agc2-line/api/credenciales/login";
	private static final String URL_ENVIO_TRAMA = "http://webapp17.sedapal.com.pe:8080/agc2-line/init/cargas-trabajos/trama";


	public static void main(String[] args) {SpringApplication.run(EasyNotesApplication.class, args);




/*
		try {
			URL url = new URL(URL_LOGIN);

			OkHttpClient client = new OkHttpClient().newBuilder().build();

			String jsonLogin = "{\r\n    \"usuario\": \"AGC80037\",\r\n    \"clave\": \"Agc2019*\"\r\n}";

			MediaType mediaType = MediaType.parse("application/json");
			RequestBody body = RequestBody.create(mediaType,jsonLogin );
			Request request = new Request.Builder()
					.url(URL_LOGIN)
					.method("POST", body)
					.addHeader("Content-Type", "application/json")
					.build();
			Response response = client.newCall(request).execute();

			String jsonStr = response.body().string();
			JSONObject jsonObj = new JSONObject(jsonStr);

			String token = jsonObj.getJSONObject("resultado").getString("token");
			System.out.println(token);

			//   String trama = "\r\n \r\n[\r\n{\r\n  \"uidCargaTrabajo\": \"4111TE202009017\",\r\n  \"uidActividad\": \"TE\",\r\n  \"usuario\": \"UTEST-ONLINE\",\r\n  \"actividad\":\r\n    {\r\n        \"codigoRegistro\": 1,\r\n        \"numeroApaObs\": \"NROPRUEB\",\r\n        \"opcional\": \"OBS\",\r\n        \"lecturaMedidor\": \"1399\",\r\n        \"primerIncidente\": \"\",\r\n        \"detallePrimerIncidente\": \"\",\r\n        \"segundoIncidente\": \" \",\r\n        \"detalleSegundoIncidente\": \"\",\r\n        \"tercerIncidente\": \"\",\r\n        \"detalleTercerIncidente\": \"\",\r\n        \"fechaLectura\": \"02/09/2019\",\r\n        \"horaLectura\": \"09:00\",\r\n        \"codigoTomadorEstado\": \"12756\",\r\n        \"medio\": \"TPL\",\r\n        \"numeroActaIncidencia\": \"\"\r\n    },\r\n  \"coordImages\":\r\n    {\r\n      \"v_coord_puntocap_x\": \"12.2764774\",\r\n      \"v_coord_puntocap_y\": \"23.187838\",\r\n      \"v_coord_puntoenv_x\": \"12.28758\",\r\n      \"v_coord_puntoenv_y\": \"-11.190283\",\r\n      \"d_fecha_envio\": \"01/10/2020 02:20:14\",\r\n      \"v_imagen_1\": \" \",\r\n      \"v_imagen_2\": \" \",\r\n      \"v_imagen_3\": \" \"\r\n    }\r\n, \"nis\" : \"4096357\"\r\n, \"ciclo\" : \"10\"\r\n, \"imei\" : \"IMEI1_09-10-2020\"\r\n  }\r\n] \r\n ";

			String trama = "[\n" +
					"{\n" +
					"  \"uidCargaTrabajo\": \"3311TE202009015\",\n" +
					"  \"uidActividad\": \"TE\",\n" +
					"  \"usuario\": \"UTEST-ONLINE\",\n" +
					"  \"actividad\":\n" +
					"    {\n" +
					"        \"codigoRegistro\": 2,\n" +
					"        \"numeroApaObs\": \"NROPRUEB\",\n" +
					"        \"opcional\": \"OBS\",\n" +
					"        \"lecturaMedidor\": \"1399\",\n" +
					"        \"primerIncidente\": \"\",\n" +
					"        \"detallePrimerIncidente\": \"\",\n" +
					"        \"segundoIncidente\": \" \",\n" +
					"        \"detalleSegundoIncidente\": \"\",\n" +
					"        \"tercerIncidente\": \"\",\n" +
					"        \"detalleTercerIncidente\": \"\",\n" +
					"        \"fechaLectura\": \"02/09/2019\",\n" +
					"        \"horaLectura\": \"09:00\",\n" +
					"        \"codigoTomadorEstado\": \"12756\",\n" +
					"        \"medio\": \"TPL\",\n" +
					"        \"numeroActaIncidencia\": \"\"\n" +
					"    },\n" +
					"  \"coordImages\":\n" +
					"    {\n" +
					"      \"v_coord_puntocap_x\": \"12.2764774\",\n" +
					"      \"v_coord_puntocap_y\": \"23.187838\",\n" +
					"      \"v_coord_puntoenv_x\": \"12.28758\",\n" +
					"      \"v_coord_puntoenv_y\": \"-11.190283\",\n" +
					"      \"d_fecha_envio\": \"01/10/2020 02:20:14\",\n" +
					"      \"v_imagen_1\": \" \",\n" +
					"      \"v_imagen_2\": \" \",\n" +
					"      \"v_imagen_3\": \" \"\n" +
					"    }\n" +
					", \"nis\" : \"4096357\"\n" +
					", \"ciclo\" : \"10\"\n" +
					", \"imei\" : \"IMEI1_09-10-2020\"\n" +
					"  }\n" +
					"] ";

			OkHttpClient client2 = new OkHttpClient().newBuilder()
					.build();
			MediaType mediaType2 = MediaType.parse("application/json");
			RequestBody body2 = RequestBody.create(mediaType2, trama);
			Request request2 = new Request.Builder()
					.url(URL_ENVIO_TRAMA)
					.method("POST", body2)
					.addHeader("Content-Type", "application/json")
					.addHeader("Authorization", token)
					.build();
			Response response2 = client2.newCall(request2).execute();

			String jsonStr2 = response2.body().string();
			JSONObject jsonObj2 = new JSONObject(jsonStr2);

			System.out.println("RESPONSE: " + jsonObj2.toString());

			//   String estado = jsonObj2.getJSONObject("estado").toString();
			//   System.out.println(estado);

			//    String mensaje = jsonObj2.getJSONObject("resultado").getString("mensaje");
			//    System.out.println(mensaje);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
*/
	}


	}

