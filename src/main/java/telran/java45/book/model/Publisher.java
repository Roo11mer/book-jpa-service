package telran.java45.book.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = { "publisherName" })
@Entity
public class Publisher implements Serializable {

	private static final long serialVersionUID = -1440133235854221438L;
	@Id
	String publisherName;

}
