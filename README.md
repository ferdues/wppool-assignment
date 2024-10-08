# wppool-assignment

# WordPress Dark Mode Automation Test Suite

This repository contains an automation test suite to test various functionalities of the "WP Dark Mode" plugin on a WordPress site. It automates the installation, activation, and configuration of the plugin and validates the Admin Dashboard and front-end dark mode functionality.

## Test Scenarios

1. Log in to your WordPress site.
2. Check whether the "WP Dark Mode" plugin is active.
   - If active, navigate to the WP Dark Mode settings.
   - If not active, install and activate the plugin.
3. Enable Admin Dashboard Dark Mode via `Controls → Admin Panel Dark Mode`.
4. Validate if Dark Mode is working on the Admin Dashboard.
5. Change the "Floating Switch Style" from the default selection in `Customization → Switch Settings`.

## Requirements

### 1. Software Dependencies

- [Java Development Kit (JDK)]
- [Maven]
- [Selenium WebDriver]

### 2. WordPress Setup

- Install the WordPress site with administrator privileges.
- Ensure that the admin panel is accessible at `/wp-admin`.
