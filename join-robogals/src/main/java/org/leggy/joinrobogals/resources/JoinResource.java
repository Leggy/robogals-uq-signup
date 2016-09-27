package org.leggy.joinrobogals.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.leggy.joinrobogals.api.Saying;

import com.codahale.metrics.annotation.Timed;

@Path("/join")
@Produces(MediaType.APPLICATION_JSON)
public class JoinResource {

	public JoinResource() {
	}

	@POST
	@Timed
	public Saying join(@FormParam("firstName") String firstName,
			@FormParam("surname") String surname,
			@FormParam("email") String email,
			@FormParam("studentNumber") String studentNumber,
			@FormParam("degree") String degree, @FormParam("year") String year,
			@FormParam("gender") String gender) {

		System.out.println(String.format(
				"Name: %s %s\nEmail: %s\nStdNo: %s\nDegree: %s [%s]\nGender: %s",
				firstName, surname, email, studentNumber, degree, year,
				gender));
		return new Saying(1337, firstName);
	}
}
