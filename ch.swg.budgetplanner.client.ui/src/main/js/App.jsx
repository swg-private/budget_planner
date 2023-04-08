import React from "react";
import Box from '@mui/material/Box';
import CssBaseline from '@mui/material/CssBaseline';
import Page from './components/Page';
import Navigation from "./components/Navigation";

export class App extends React.Component {
  
  render() {
    return (
      <Box sx={{ display: 'flex' }}>
        <CssBaseline />
        <Navigation />
        <Page />
      </Box>
    );
  }
}