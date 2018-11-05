package org.kulkarni.webservice.messanger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kulkarni.webservice.messanger.model.Profile;
import org.kulkarni.webservice.messanger.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

	ProfileService profileService = new ProfileService();
	
	@GET
	public List<Profile> getProfiles(){
		return profileService.getAllProfiles();
	}
	
	@GET
	@Path("/{profileName}")
	public Profile getProfileById(@PathParam("profileName") String profileName) {
		return profileService.getProfile(profileName);
	}
	
	@POST
	public void saveProfile(Profile profile) {
		profileService.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileName}")
	public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile) {
		profile.setProfileName(profileName);
		return profileService.updateProfile(profile);
	}
	
	
	@DELETE
	@Path("/{profileName}")
	public void deleteProfile(@PathParam("profileName") String profileName) {
		profileService.removeProfile(profileName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
