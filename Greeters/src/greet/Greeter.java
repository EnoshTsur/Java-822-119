package greet;

import java.time.LocalDateTime;

public class Greeter implements Comparable<Greeter>{

	private LocalDateTime birthDate;
	private String message;
	private boolean seen;
	
	
	public Greeter(LocalDateTime birthDate, String message) {
		this.birthDate = birthDate;
		this.message = message;
		this.seen = false;
	}

	@Override
	public int compareTo(Greeter other) {
		return this.birthDate.compareTo(other.birthDate);
	}


	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public boolean isSeen() {
		return seen;
	}


	public void setSeen(boolean seen) {
		this.seen = seen;
	}

	@Override
	public String toString() {
		return "Greeter [birthDate=" + birthDate + ", message=" + message + ", seen=" + seen + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + (seen ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Greeter other = (Greeter) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (seen != other.seen)
			return false;
		return true;
	}


}
