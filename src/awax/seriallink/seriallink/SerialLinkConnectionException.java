/*******************************************************************************
 * MIT License
 *
 * Copyright (c) 2017 Julien Le Sauce
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *******************************************************************************/
package awax.seriallink.seriallink;

/**
 * Permet de créer une exception notifiant une erreur sur la liaison série.
 * 
 * @author AwaX
 * @created 28 avr. 2014
 * @version 1.0
 */
public class SerialLinkConnectionException extends Exception {

	private static final long serialVersionUID = -2168581748918880L;

	/**
	 * Permet de construire une exception sans informations.
	 */
	public SerialLinkConnectionException () {
		super();
	}

	/**
	 * Permet de construire une exception avec un message d'erreur.
	 * 
	 * @param message
	 *            Message d'erreur associé à l'exception.
	 */
	public SerialLinkConnectionException (String message) {
		super(message);
	}

	/**
	 * Permet de construire une exception avec un message d'erreur et la cause
	 * de cette erreur.
	 * 
	 * @param message
	 *            Message d'erreur associé à l'exception.
	 * @param e
	 *            Cause de l'exception.
	 */
	public SerialLinkConnectionException (String message, Throwable e) {
		super(message, e);
	}
}