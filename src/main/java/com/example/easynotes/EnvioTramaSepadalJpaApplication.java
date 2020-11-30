package com.example.easynotes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.example.easynotes.model.Lec_lectura;
import com.example.easynotes.repository.Lec_lecturaRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


@SpringBootApplication
public class EnvioTramaSepadalJpaApplication implements CommandLineRunner {


    @Autowired
    private Lec_lecturaRepository lec_lecturaRepo;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(EnvioTramaSepadalJpaApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
		/*List<Customer> customer = customerRepo.findAll();

		customer.forEach(System.out :: println);

		List<Gls_gr_mae_opcion> gls_gr_mae_opcion = gls_gr_mae_opcionRepo.findAll();

		gls_gr_mae_opcion.forEach(System.out :: println);*/

        String sql = "Select top 5 [IDLECTURA]\n" +
                "      ,[COD_UNICOM]\n" +
                "      ,[ANNO]\n" +
                "      ,[MES]\n" +
                "      ,[CICLO_FACT]\n" +
                "      ,[ID_RUTA]\n" +
                "      ,[NUM_ITIN]\n" +
                "      ,[AOL]\n" +
                "      ,[NOM_RAZ_SO]\n" +
                "      ,[NOM_LOCAL]\n" +
                "      ,[NOM_CALLE]\n" +
                "      ,[COMPL_DIR]\n" +
                "       from Lec_lectura" ;
        List<Lec_lectura> customers = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Lec_lectura.class));

        customers.forEach(System.out :: println);

        List myList = new ArrayList<>();
        JSONArray jsonArray = new JSONArray(customers);
        System.out.println(jsonArray);



















    }



}
