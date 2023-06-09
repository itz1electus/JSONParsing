package com.mufasa.jsonparsing;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AssessmentOptions {

	@SerializedName("interpretations")
	@Expose
	private List<String> interpretations;
	@SerializedName("position")
	@Expose
	private int position;
	@SerializedName("role")
	@Expose
	private String role;
	@SerializedName("suggestedTreatments")
	@Expose
	private List<String> suggestedTreatments;

	public List<String> getInterpretations() {
		return interpretations;
	}

	public void setInterpretations(List<String> interpretations) {
		this.interpretations = interpretations;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<String> getSuggestedTreatments() {
		return suggestedTreatments;
	}

	public void setSuggestedTreatments(List<String> suggestedTreatments) {
		this.suggestedTreatments = suggestedTreatments;
	}

}
